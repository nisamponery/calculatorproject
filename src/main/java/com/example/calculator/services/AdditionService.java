package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {

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

	public AdditionService(int x,int y) {
		this.x = x;
		this.y = y;
	}

	public int getSum(){
		return x + y;
	}


}
