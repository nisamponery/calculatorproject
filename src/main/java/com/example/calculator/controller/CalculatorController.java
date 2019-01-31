package com.example.calculator.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.factory.ArithmeticFactory;
import com.example.calculator.util.Formatter;



@RestController
@RequestMapping(value="/app")
public class CalculatorController
{
	@Autowired
	Formatter format;
	
	@Autowired
	ArithmeticFactory facotry;
	
	@GetMapping("/welcome")
	public String welcome(@RequestParam(value="name", defaultValue="Result Comming Soon!") String name){
		return "Application under construction : " + name;
		
	}
	
	@GetMapping("/compute")
	public String getResult(@RequestParam() HashMap<String,String> map ){
		
		System.out.println("map : " + map.toString());
		
		
		String input = map.get("num1") + map.get("operator")+ map.get("num2");
		int result =0;
		
		if(format.validateInput(map)) {
			int x = Integer.parseInt( map.get("num1") );
			int y = Integer.parseInt( map.get("num2") );
			result = facotry.process(x, y, map.get("operator"));
			
		}
		System.out.println("compute request :  " + input + " = " + result);
		return "compute request :  " + input + " = " + result ;
		
	}

}
