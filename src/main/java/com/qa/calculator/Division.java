package com.qa.calculator;

public class Division {

	public int divide(int input1, int input2) {
		
		if(input2 == 0) {
			
			return 0;
		}
		else {
			return input1 / input2;
		}
	}
}
