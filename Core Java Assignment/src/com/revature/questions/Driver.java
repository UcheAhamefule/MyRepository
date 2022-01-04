package com.revature.questions;

public class Driver {
	
	public static void main(String[] args) {
		
		//calling the bubbleSort method Question1 class
		Question1 q1 = new Question1();
		int[] array = {1,0,5,6,3,2,3,7,9,8,4};
		q1.bubbleSort(array);
		System.out.println("Q1 "+ q1);
		
		// Calling the fibonacci method in Question2 two class
		Question2 q2 = new Question2();
		q2.fibonacci(25);
		System.out.println("Q2" + q2);
		
		// Calling the reverse method in Question3 two class
		Question3 q3 = new Question3();
		String aStr = "Hello World";
		q3.reverseStrings(aStr);
		System.out.println();
		System.out.println("Q3" + q3);
		
		
		// Calling the factorial N method in Question4 two class
		Question4 q4 = new Question4();
		int fact = 25;
		q4.factorialCompute(fact);
		System.out.println();
		System.out.println("Q4" + q4);
		
		// Calling the subString method in Question5 class
		Question5 q5 = new Question5();
		String givenString = "How are we going to achieve this";
		int idx = 3;
		q5.subString(givenString, 3);
		System.out.println();
		System.out.println("Q5"+ q5);
	}

}
