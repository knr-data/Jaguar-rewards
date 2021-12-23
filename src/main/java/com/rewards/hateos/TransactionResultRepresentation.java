package com.rewards.hateos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rewards.model.RewardsResult;
import org.springframework.hateoas.RepresentationModel;

public class TransactionResultRepresentation extends RepresentationModel<TransactionResultRepresentation> {

    private RewardsResult transactionResult;

    @JsonCreator
    public TransactionResultRepresentation(@JsonProperty("rewards") RewardsResult transactionResult) {
        this.transactionResult = transactionResult;
    }

    public RewardsResult getTransactionResult() {
        return transactionResult;
    }
}

