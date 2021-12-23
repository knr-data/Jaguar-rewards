package com.rewards.dao;

import com.rewards.model.DailyTransaction;

import java.util.List;

/**
 * Date access layer for the Transactional Data
 */
public interface TransactionDao {

    /**
     * Creates transactions and return the transaction identifier
     * @param transaction
     * @return
     */
    long createTransaction(DailyTransaction transaction);

    /**
     * Returns the rewards from the current month upto the current month minus the noofmonths
     * @param userId
     * @param noOfMonths
     * @return
     */
    List<DailyTransaction> getRewards(String userId, int noOfMonths);

}
