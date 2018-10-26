package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories(basePackages="com")
@EntityScan(basePackages="com")
public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("in test...");
		SpringApplication.run(Test.class, args);
		System.out.println("main end...");
	}
}
