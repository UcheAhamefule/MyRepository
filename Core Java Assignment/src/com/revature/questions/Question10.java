package com.revature.questions;

import java.util.Scanner;

public class Question10 {

	public void findMinMax(int n1, int n2) {
		
		int min = n1 > n2 ? n2 : n1;
		int max = n1 > n2 ? n1 : n2;
		System.out.println("The max is: " + max +", The min is: "+min);
	}
}
