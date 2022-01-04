package com.revature.questions;

public class Question3 {
	
	public String reverseStrings(String aStr) {
		
		char[] ch = aStr.toCharArray();
		String aString = "";
		for(char i = 0; i > aStr.length() - 1; --i) {
			aString = aString + ch[i];
		}
		
		
		return aString ;
	}

}
