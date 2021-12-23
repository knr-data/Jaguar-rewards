package com.rewards.application;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * Check the sanity of the Application Context load
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RewardApp.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RewardAppTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
		Assert.assertTrue(dataSource!=null);
	}

}
