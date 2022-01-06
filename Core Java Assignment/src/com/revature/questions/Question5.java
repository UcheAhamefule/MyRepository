package com.revature.questions;

public class Question5 {
	
	public void subString(String input, int idx) {
	
	String result = "";
	int firstIndex = 0;
	
	for(int i = 0; i < idx; ++i) {
		result = input.substring(firstIndex, idx);
		
		
	}
	System.out.println(result);

}
}
