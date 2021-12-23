package com.rewards.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.lang.NonNull;

import java.util.Date;

public class DailyTransaction {

    @NonNull
    private long id;
    @NonNull
    private String userId;
    @NonNull
    private Double amount;
    @NonNull
    private Date txnDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    @NonNull
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@NonNull Double amount) {
        this.amount = amount;
    }

    @NonNull
    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(@NonNull Date txnDate) {
        this.txnDate = txnDate;
    }

    @Override
    public String toString() {
        return "DailyTransaction{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", amount=" + amount +
                ", txnDate=" + txnDate +
                '}';
    }
}
