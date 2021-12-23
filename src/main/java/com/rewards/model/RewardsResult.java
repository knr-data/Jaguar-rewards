package com.rewards.model;

import java.util.List;

public class RewardsResult {

     private List<MonthlyRewards> monthlyRewardsList;
     private int totalRewards;

    public List<MonthlyRewards> getMonthlyRewardsList() {
        return monthlyRewardsList;
    }

    public void setMonthlyRewardsList(List<MonthlyRewards> monthlyRewardsList) {
        this.monthlyRewardsList = monthlyRewardsList;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(int totalRewards) {
        this.totalRewards = totalRewards;
    }

    @Override
    public String toString() {
        return "RewardsResult{" +
                "monthlyRewardsList=" + monthlyRewardsList +
                ", totalRewards=" + totalRewards +
                '}';
    }
}
