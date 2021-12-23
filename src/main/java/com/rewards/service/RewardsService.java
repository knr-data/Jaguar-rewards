package com.rewards.service;

import com.rewards.dao.TransactionDao;
import com.rewards.model.DailyTransaction;
import com.rewards.model.MonthlyRewards;
import com.rewards.model.RewardsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service tier to handle transactions and queries
 */
@Component
public class RewardsService {

    @Autowired
    TransactionDao transactionDao;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");

    /**
     * Returns the rewards for the passed user. Default query of 3 months is used.
     * @param userid
     * @return
     */
    public RewardsResult getRewards(String userid) {
        List<DailyTransaction> dailyTransactions = transactionDao.getRewards(userid, 0);
        RewardsResult result = new RewardsResult();
        Map<String, Double> resMap = dailyTransactions.stream()
                                                          .collect(Collectors.groupingBy(RewardsService::format,Collectors.summingDouble(DailyTransaction::getAmount)));
        List<MonthlyRewards> monthlyRewardsList = resMap.entrySet().stream().map(kv -> {
            MonthlyRewards monthlyRewards = new MonthlyRewards();
            monthlyRewards.setMonth(kv.getKey());
            monthlyRewards.setRewards(computeRewards(kv.getValue()));
            return monthlyRewards;
        }).collect(Collectors.toList());
        result.setMonthlyRewardsList(monthlyRewardsList);
        result.setTotalRewards(monthlyRewardsList.stream().map(rewards -> rewards.getRewards()).reduce(0,Integer::sum));
        return result;
    }


    private static String format(DailyTransaction dailyTxn) {

        return dateFormat.format(dailyTxn.getTxnDate());
    }

    private static int computeRewards(Double amount){

        if(amount < 100 && amount > 50){
            return (int) (amount-50);
        }
        else if(amount>100){

            return 50 + ((int) (amount-100)) *2;
        }

        return 0;
    }
}