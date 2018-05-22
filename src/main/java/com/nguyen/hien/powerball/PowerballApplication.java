package com.nguyen.hien.powerball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class PowerballApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerballApplication.class, args);
	}
}
