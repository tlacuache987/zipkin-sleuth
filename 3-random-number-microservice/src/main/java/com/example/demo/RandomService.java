package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.SneakyThrows;

@Service
public class RandomService {

	private Random random = new Random();

	@SneakyThrows
	public int next() {
		return random.nextInt(40);
	}

}
