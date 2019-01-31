package com.example.calculatorproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.calculator.services.AdditionService;
import com.example.calculator.services.DivisionService;
import com.example.calculator.services.MultiplicationService;
import com.example.calculator.services.SubtractionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorprojectApplicationTests {
	
	public static void main (String [] args) {
		testAddition(2,10);
		testSubtraction(10,7);
		testMultiplication(7,8);
		testDivision(45,5);
	}
	
	public static void testAddition(int x,int y) {
		AdditionService addobj = new AdditionService();
		//addobj.setX(10);
		System.out.println("TEST Addition");
		System.out.println("x + y =" + addobj.getResult(x, y));
	}
	
	public static void testSubtraction(int x, int y ) {
		SubtractionService diffObj = new SubtractionService();
		//diffObj.setX(20);
		System.out.println();
		System.out.println("x - y =" + diffObj.getResult(x,y));
		
	}
	
	public static void testMultiplication(int x, int y ) {
		MultiplicationService multiObj = new MultiplicationService();
		System.out.println();
		System.out.println("TEST Multiplication");
		System.out.println("x * y =" + multiObj.getResult(x,y));
		
	}
	
	public static void testDivision(int x, int y ) {
		DivisionService divObj = new DivisionService();
		System.out.println();
		System.out.println("TEST Division");
		System.out.println("x / y =" + divObj.getResult(x,y));
		
	}
	
	/*@Test
	public void contextLoads() {

	}*/

}
