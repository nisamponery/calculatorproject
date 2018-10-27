package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {
	
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
		
		public SubtractionService(int a,int b) {
			x = a;
			y = b;
		}
		public int getDiff(){
			return x - y;
		}

		
	}
	

