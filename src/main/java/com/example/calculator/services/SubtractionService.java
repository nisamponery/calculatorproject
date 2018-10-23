package com.example.calculator.services;

public class SubtractionService {
	
	//TODO Create two int variables
		private int x;
		private int y;
		
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
		public SubtractionService(int a,int b) {
			x = a;
			y = b;
		}
		//TODO Create method to return the difference of the 2 varaibles
		public int getDiff(){
			return x - y;
		}

		
	}
	

