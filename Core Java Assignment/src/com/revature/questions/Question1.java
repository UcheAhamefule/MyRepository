/*
 * This class contains the method called bubbleSort().
 * 
 * This method sorts a given set of disarranged array into a sorted number of array. 
 * 
 * */

package com.revature.questions;

public class Question1 {
	
	//Method to sort an Array
	public void bubbleSort(int[] array) {
		
		
		int lesser;
		int greater;
		
		for(int i = 0; i < array.length; ++i) { // iterating over the given array
			for(int j = 0; j < array.length-1; ++j ) {
				if(array[j] < array[j + 1] ) {
					
					lesser = array[j];
					greater = array[j + 1];
					
					array[j] = lesser;
					array[j + 1] = greater;
					
					System.out.println(lesser);
					System.out.print(greater);
				}
			}
		}
		
		
	}
}
