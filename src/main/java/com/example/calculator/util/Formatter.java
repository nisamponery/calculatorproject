package com.example.calculator.util;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class Formatter {
	
	
	/*
	 * Use this as the primary method in this class and 
	 * create additonal methods to help you with your task
	 * if the code is getting too cumbersome 
	 * always consider breaking it down to helper methods
	 */
	public boolean validateInput (HashMap<String,String> map){
		/*
		 * I have created two dummy helper methods below try to use them while finsihing
		 * these tasks and if you feel additional mehtods are necessary feel free to create
		 * them.
		 * Also if you have a better approach you can experiment as well
		 */
		
		String num1 = map.get("num1");
		String oper	= map.get("operator");
		String num2 = map.get("num2");
		
		
		return validateNumbers(num1) && validateNumbers(num2) && validateOperator(oper) ;
	} 
	
	private boolean validateNumbers (String num){
		try{
			int x = Integer.parseInt(num);
		}
		catch(NumberFormatException e){
			
			System.out.println("Exception caught : Invalid number inout");
			return false;
		}
		
		return true;
	}
	
	private boolean validateOperator (String oper){
		try{
			if(!OperatorConstants.operList.contains(oper)){
				System.out.println("Invalid operator");
				return false;
			}
		}
		catch(Exception e){
			
			System.out.println("Exception caught : Invalid operator");
			return false;
		}
		
		return true;
	}
	
	
	//TODO: Create a function format the given input
	/*
	 * Input  will be a string of the format  "123+543"
	 * so the format is First Number followed by the operator and then Second Number
	 * Possible Operators: (+ - * '/') 
	 * its possible to get input that are not valid numbers, ex: asdasd+adsad
	 * So you should handle bad inputs and return appropriate message back
	 * 
	 */
	
	//HELPER METHOD
	public void extractInput(){
		
		/*
		 * Fill in the code
		 * refer to the above comments
		 * Test your code in the test class before pushing it in wi
		 */
		
	}
	
	//TODO: After input is formatted create a funtion to call
	//the apropriate Arithmetic services and return the result
	/*
	 * List of Arrithmetic Services are the Classes that are created under
	 * services Package(folder), ex: AdditionService.java
	 * 
	 * Return the result back as a String
	 * 
	 */
	
	//HELPER METHOD
	public void getResult(){
		
		
	}
}
