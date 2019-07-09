package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;

@Service
public class UppercaseServiceClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${uppercase-service-url}")
	private String uppercaseServiceURL;

	@SneakyThrows
	public String toUppercase(String name) {
		return restTemplate.getForObject(uppercaseServiceURL + "/" + name, String.class);
	}

}
