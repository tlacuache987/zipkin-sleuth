package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.SneakyThrows;

@Service
public class UppercaseService {

	@SneakyThrows
	public String toUpperCase(String input) {
		return input.toUpperCase();
	}

}
