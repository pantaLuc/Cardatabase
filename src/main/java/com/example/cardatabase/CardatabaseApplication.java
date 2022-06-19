package com.example.cardatabase;

import com.example.cardatabase.model.Car;

import com.example.cardatabase.repository.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	// we add spring boot development tools to make the process simpler . The most important feature of the development tools is automatic restart whenever files
	//on classpath are modified.

	// Logging can be used to monitor your application flow, and it is a good way to capture unexpected errors in your program code.
	private static  final Logger logger= LoggerFactory.getLogger(CardatabaseApplication.class);
	@Autowired
	CardRepository repository;
	public static void main(String[] args) {

		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Application started");
	}


	@Override
	public void run(String... args) throws Exception {
		//repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
		System.out.println(" I love being a coder ");
	}
}
