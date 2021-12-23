package com.rewards.model;

import java.util.Date;

public class MonthlyRewards {

    private String month;
    private int rewards;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    @Override
    public String toString() {
        return "MonthlyRewards{" +
                "month=" + month +
                ", rewards=" + rewards +
                '}';
    }
}
