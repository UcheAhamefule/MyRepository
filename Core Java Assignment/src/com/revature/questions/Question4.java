package com.revature.questions;



public class Question4 {
	
	public void factorialCompute(int number){
		
		int i = 1;
		int factor = 1;
		
		for (i = 1; i < number; i++) {
			factor = factor * i;
		}
		System.out.println("The factor of " + number + " is " + factor );
	}

}
