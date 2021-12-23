package com.rewards.mapper;

import com.rewards.model.DailyTransaction;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Maps result set from database to domain object
 */
public class TransactionMapper implements RowMapper<DailyTransaction> {

    @Override
    public DailyTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {

        DailyTransaction txn = new DailyTransaction();
        txn.setId(rs.getLong("id"));
        txn.setAmount(rs.getDouble("amount"));
        txn.setUserId(rs.getString("userid"));
        txn.setTxnDate(rs.getDate("txnDate"));

        return txn;


    }
}
