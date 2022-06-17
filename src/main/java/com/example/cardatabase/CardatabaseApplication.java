package com.example.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CardatabaseApplication {
	// we add spring boot development tools to make the process simpler . The most important feature of the development tools is automatic restart whenever files
	//on classpath are modified.

	// Logging can be used to monitor your application flow, and it is a good way to capture unexpected errors in your program code.
	private static  final Logger logger= LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

}
