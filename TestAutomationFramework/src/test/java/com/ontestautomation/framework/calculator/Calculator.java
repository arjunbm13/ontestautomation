package com.ontestautomation.framework.calculator;

public class Calculator {
	
	int result;
	
	public Calculator() {
		this.result = 0;
	}
	
	public void add(int x, int y) {
		this.result = x + y;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void reset() {
		this.result = 0;
	}
}