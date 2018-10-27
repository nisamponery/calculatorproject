package com.example.calculator.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.util.Formatter;



@RestController
@RequestMapping(value="/app")
public class CalculatorController
{
	@Autowired
	Formatter format;
	
	@GetMapping("/welcome")
	public String welcome(@RequestParam(value="name", defaultValue="Result Comming Soon!") String name){
		return "Application under construction : " + name;
		
	}
	
	@GetMapping("/compute")
	public String getResult(@RequestParam() HashMap<String,String> map ){
		
		System.out.println("map : " + map.toString());
		
		String input = map.get("num1") + map.get("operator")+ map.get("num2");
		format.process(input);
		return "compute request " ;
		
	}

}
