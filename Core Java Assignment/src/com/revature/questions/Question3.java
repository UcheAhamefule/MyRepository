package com.revature.questions;

public class Question3 {
	
	public void reverseStrings(String aStr) {
		
		String rev = "";
		for(int i = aStr.length() - 1; i >= 0;  i--) {
			
			rev = rev + aStr.charAt(i);
		}
		
		
		System.out.println("The reverse value is: " + rev); 
	}



}
