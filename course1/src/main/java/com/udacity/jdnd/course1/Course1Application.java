package com.udacity.jdnd.course1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class Course1Application {

	public static void main(String[] args) {
		SpringApplication.run(Course1Application.class, args);
	}

	@Bean
	public String basicMessage(){
		System.out.println("Message1 started");
		return "Hello World!";
	}
	@Bean
	@Primary
	public String consumeMessage(String message){
		System.out.println("Message2 started " + message);
		return "Message: " + message;
	}
	@Bean
	public int messageCharCount(String message){
		System.out.println("Message3 Started " +  message);
		return message.length();
	}


}
