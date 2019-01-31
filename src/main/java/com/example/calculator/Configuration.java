package com.example.calculator;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.calculator.services.AdditionService;
import com.example.calculator.services.DivisionService;
import com.example.calculator.services.MultiplicationService;
import com.example.calculator.services.SubtractionService;

@SpringBootConfiguration
public class Configuration {
	@Bean
	int defaultInt(){
		
		return 0;
	}
	@Bean
	AdditionService addService(){
		
		return new AdditionService();
	}
	
	@Bean
	SubtractionService subService(){
		
		return new SubtractionService();
	}
	
	@Bean
	DivisionService divService(){
		
		return new DivisionService();
	}

	@Bean
	MultiplicationService mulService(){
		
		return new MultiplicationService();
	}
}
