package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {
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
	public DivisionService(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getDiv() {
		return x/y;
	}
	
	
}
