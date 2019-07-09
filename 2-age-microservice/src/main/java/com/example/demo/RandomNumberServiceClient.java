package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;

@Service
public class RandomNumberServiceClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${random-number-service-url}")
	private String randomNumberServiceURL;

	@SneakyThrows
	public int getRandomNumber() {
		return restTemplate.getForObject(randomNumberServiceURL, Integer.class);
	}

}
