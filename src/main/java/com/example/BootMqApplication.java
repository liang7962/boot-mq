package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMqApplication {


	protected static Logger logger= LoggerFactory.getLogger(BootMqApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(BootMqApplication.class, args);
		logger.info("SpringBoot Start Success");

	}
}
