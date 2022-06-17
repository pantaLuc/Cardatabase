package com.example.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication {
	// we add spring boot development tools to make the process simpler . The most important feature of the development tools is automatic restart whenever files
	//on classpath are modified.

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

}
