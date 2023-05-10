package com.example.boj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class CourseDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseDetailsApplication.class, args);
	}

}
