package com.bj.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAPI {

	final static Logger logger = Logger.getLogger(CourseAPI.class);

	public static void main(String[] args) {

		logger.info("Application execution started");		
		SpringApplication.run(CourseAPI.class, args);	
		logger.info("Application execution started");
	}

}
