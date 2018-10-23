package com.example.calculator.services;

public class AdditionService {
	
	//TODO Create two int variables
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//TODO Create Constructor to take the arguments 
	public AdditionService(int a,int b) {
		x = a;
		y = b;
	}
	//TODO Create method to return the sum of the 2 variables
	public int getSum(){
		return x + y;
	}

/*	public static void main (String [] args) {
		AdditionService addobj = new AdditionService(12,15);
		addobj.setX(10);
		System.out.println("TEST");
		System.out.println("x =" + addobj.getX());
		System.out.println("y =" + addobj.getY());
		System.out.println("x + y =" + addobj.getSum());
	}*/
}
