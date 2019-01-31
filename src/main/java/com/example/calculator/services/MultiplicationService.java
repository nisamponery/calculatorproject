package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService implements ArithmeticService {
	
	public int getResult(int x, int y){
		return x*y;
	}
	
	

}
