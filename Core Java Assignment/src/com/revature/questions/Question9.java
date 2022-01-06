package com.revature.questions;

import java.util.ArrayList;

public class Question9 {
	
	
	public static ArrayList<Integer> findPrimeNums(int startNum, int endNum) {
	
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
	
		for(int n = startNum; n <= endNum; n++) {
			boolean prime = true;
			//System.out.println(prime);
			int i = 2;
			while(i <= n/2) {
				if(n % i == 0) {
					prime = false;
					//System.out.println(prime);
					break;
				}
				i++;
				
			}
			if(prime) {
				primeNums.add(n);
				
				
				
			}
			
		}
	
		return primeNums;
	}

}
