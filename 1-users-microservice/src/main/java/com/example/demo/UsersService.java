package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.SneakyThrows;

@Service
public class UsersService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AgeServiceClient ageServiceClient;

	@Autowired
	private UppercaseServiceClient uppercaseServiceClient;

	@SneakyThrows
	public User getUser(String name) {

		logger.info("Before sending GET Age HTTP Request");

		int age = ageServiceClient.getAge(name);

		logger.info("Age web service endpoint was called and response recieved ");

		logger.info("Before sending GET Age HTTP Request");

		String nameUppercase = uppercaseServiceClient.toUppercase(name);

		logger.info("Age web service endpoint was called and response recieved ");

		return new User(nameUppercase, age);

	}

}
