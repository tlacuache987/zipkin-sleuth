package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;

@Service
public class AgeServiceClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${age-service-url}")
	private String ageServiceURL;

	@SneakyThrows
	public int getAge(String name) {
		return restTemplate.getForObject(ageServiceURL, Integer.class);

	}

}
