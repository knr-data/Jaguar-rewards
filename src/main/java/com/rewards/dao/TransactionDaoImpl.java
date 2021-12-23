package com.rewards.dao;

import com.rewards.mapper.TransactionMapper;
import com.rewards.model.DailyTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class TransactionDaoImpl implements TransactionDao{

    private Logger logger = LoggerFactory.getLogger(TransactionDao.class);

    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL_TXNS = "Select * From DAILY_TRANSACTION WHERE userid = ? and txnDate >= add_months(sysdate, ?)";


    @Autowired
    public TransactionDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }



    @Override
    public long createTransaction(DailyTransaction transaction) {
        return 0;
    }

    @Override
    public List<DailyTransaction> getRewards(String userId, int noOfMonths) {
        int numMoths = noOfMonths!=0? noOfMonths:3;
        List<DailyTransaction> result = jdbcTemplate.query(SQL_GET_ALL_TXNS, new TransactionMapper(), userId,-numMoths);
        logger.info("Result from Database is {}", result.toString());
        return result;
    }
}
