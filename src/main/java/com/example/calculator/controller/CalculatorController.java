package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/app")
public class CalculatorController
{
 
	@GetMapping("/welcome")
	public String welcome(){
		return "Application under construction";
		
	}

}
