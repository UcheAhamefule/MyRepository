package com.revature.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		//calling the bubbleSort method Question1 class
		System.out.println("Q1.");
		Question1 q1 = new Question1();
		int[] array = {1,0,5,6,3,2,3,7,9,8,4};
		q1.bubbleSort(array);
		System.out.println("");
		
		// Calling the fibonacci method in Question2 two class
		System.out.println("Q2.");
		Question2.fibonacci(25);
		System.out.println("");
		
		
		// Calling the reverse method in Question3 two class
		System.out.println("Q3.");
		Question3 q3 = new Question3();
		String aStr = "Hello World";
		q3.reverseStrings(aStr);
		System.out.println(q3);
		System.out.println("");
		
		// Calling the factorial N method in Question4 two class
		System.out.println("Q4");
		Question4 q4 = new Question4();
		int fact = 25;
		q4.factorialCompute(fact);
		System.out.println( q4);
		System.out.println("");
		
		// Calling the subString method in Question5 class
		System.out.println("Q5");
		Question5 q5 = new Question5();
		String givenString = "We need to work really hard every day";
		q5.subString(givenString, 23);
		System.out.println(q5);
		System.out.println("");
		
		// Calling the method that checks if a number is EVEN in Question6 two class
		System.out.println("Q6");
		Question6 q6 = new Question6();
		q6.checkEvenOrOdd(20);
		System.out.println(q6);
		System.out.println("");
		
		// Calling the compare method in Question7 class
		System.out.println("Q7");
		Question7 employed = new Question7();
		//The employee class suplies the stances of the members
		Employee emp1 = new Employee("Bob", "Bookkeeping", 32);
		Employee emp2 = new Employee("Alice","Personal", 40);
		System.out.println("Difference in age is " + employed.compare(emp1, emp2));
		System.out.println("");
		
		
		// Calling the palindrome method in Question8 
		System.out.println("Q8");
		System.out.println("Enter the word to check if it is a palindrome");
		Question8 q8 = new Question8();
		//A scanner allows you to words from keyboard
		Scanner scanWord = new Scanner(System.in);
		q8.palindrome(scanWord.nextLine());
		scanWord.close();
		System.out.println();
		System.out.println(""); 
				
		// Calling the findPrimeNums method in Question9 class 
		//The method finds prime numbers between range of two numbers
		System.out.println("Q9.");
		System.out.println(Question9.findPrimeNums(1, 100));
		System.out.println("");
		
		// Calling the findMinMax method in Question10 
		System.out.println("Q10.");
		Question10 q10 = new Question10();
		System.out.println("Enter two integers, press enter button:");
		//A scanner allows one the input from keyboard
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		q10.findMinMax(a, b);
	}

}
