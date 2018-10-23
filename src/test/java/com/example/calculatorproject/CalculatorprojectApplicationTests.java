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
		AdditionService addobj = new AdditionService(x,y);
		//addobj.setX(10);
		System.out.println("TEST Addition");
		System.out.println("x =" + addobj.getX());
		System.out.println("y =" + addobj.getY());
		System.out.println("x + y =" + addobj.getSum());
	}
	
	public static void testSubtraction(int x, int y ) {
		SubtractionService diffObj = new SubtractionService(x,y);
		//diffObj.setX(20);
		System.out.println();
		System.out.println("TEST Subtraction");
		System.out.println("x =" + diffObj.getX());
		System.out.println("y =" + diffObj.getY());
		System.out.println("x - y =" + diffObj.getDiff());
		
	}
	
	public static void testMultiplication(int x, int y ) {
		MultiplicationService multiObj = new MultiplicationService(x,y);
		System.out.println();
		System.out.println("TEST Multiplication");
		System.out.println("x =" + multiObj.getX());
		System.out.println("y =" + multiObj.getY());
		System.out.println("x * y =" + multiObj.getProd());
		
	}
	
	public static void testDivision(int x, int y ) {
		DivisionService divObj = new DivisionService(x,y);
		System.out.println();
		System.out.println("TEST Division");
		System.out.println("x =" + divObj.getX());
		System.out.println("y =" + divObj.getY());
		System.out.println("x / y =" + divObj.getDiv());
		
	}
	
	/*@Test
	public void contextLoads() {

	}*/

}
