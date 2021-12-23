package com.rewards.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.rewards")

/**
 * RewardsApp is the Spring boot initializer
 */
public class RewardApp {

	public static void main(String[] args) {
		SpringApplication.run(RewardApp.class, args);
	}

}
