package com.example.calculator.factory;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.example.calculator.services.AdditionService;
import com.example.calculator.services.ArithmeticService;
import com.example.calculator.services.DivisionService;
import com.example.calculator.services.MultiplicationService;
import com.example.calculator.services.SubtractionService;
import com.example.calculator.util.OperatorConstants;

@Component
public  class ArithmeticFactory {

	private static HashMap<String,ArithmeticService> serviceMap = new HashMap<String,ArithmeticService>();
	
	public ArithmeticFactory(){
		
			serviceMap.put(OperatorConstants.ADD, new AdditionService ());
			serviceMap.put(OperatorConstants.SUBTRACT, new SubtractionService());
			serviceMap.put(OperatorConstants.MULTIPLY, new MultiplicationService ());
			serviceMap.put(OperatorConstants.DIVIDE, new DivisionService ());
				
	}
	
	public ArithmeticService getArithmeticService(String operator){
		
			return serviceMap.get(operator);
	}
	
	public int process(int x, int y, String operator ){
		
		ArithmeticService serviceObj = getArithmeticService(operator);
		return serviceObj.getResult(x, y);
		
	}
	
	
}
