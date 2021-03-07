package com.Shuttle.Shuttle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ShuttleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ShuttleApplication.class, args);
	}
}
