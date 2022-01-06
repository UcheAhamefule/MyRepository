package com.revature.questions;

import java.util.ArrayList;

public class Question8 {
	
	public static void main(String[] args) {
		palindrome();
	}

	public void palindrome() {
		
	     ArrayList< String > words = new ArrayList< String >();
	  String[] array = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
	   for(String str : array) {
		   words.add(str);
	   }
	   
	   
	   static boolean isPalindrome(ArrayList<String> words) {
		   //int front = 0, back = wo.size() -1;
		   for(String strAList : words ) {
			   for(int i = strAList.length()-1; i >= 0; i-- ) {
				   String reverse = reverse + strAList.charAt(i);
			   }
		   }
		   boolean palindrome = true;
		   for(int i = 0; i < strAList.length(); i++) {
			   if(strAList.charAt(i) != reverse.charAt(i)) {
				   palidrome = false;
			   }
		   }
		   ArrayList<String> aPalindromeList = new ArrayList<String>();
		   if(palindrome) {
			   aPalindromeList.add(strAList);
		   }else {
			   System.out.println("Not a Palindrome");
		   }
	   }
	   
	   /* 
	        while(scanInput.contentEquals(scanInput))     
	           words.add(scanInput.toString());
	        System.out.println("Is it a palindrome? " +
	              isPalindrome(words));
	        
	      }
		
	    static boolean isPalindrome(ArrayList< String > w)
	      {
	       int front  = 0, back = w.size() - 1;
	       while( front < back)
	         if (!w.get(front++).equals(w.get(back--)))
	            return false;
	        return true;
	      } */
	}

}