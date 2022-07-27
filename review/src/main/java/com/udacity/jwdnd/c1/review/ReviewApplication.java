package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@AutoConfiguration
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message(){
		System.out.println("Creating Message Bean");
		return "Hello, World!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService){
		System.out.println("Creating UpperCase Message bean");
		return messageService.uppercase();
	}

	@Bean
	public String lowercaseMessage(MessageService messageService){
		System.out.println("Creating Lowercase Message Bean");
		return messageService.lowercase();
	}
}
