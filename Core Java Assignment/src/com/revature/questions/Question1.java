/*
 * This class contains the method called bubbleSort().
 * 
 * This method sorts a given set of disarranged array into a sorted number of array. 
 * 
 * */

package com.revature.questions;


import java.util.Arrays;

public class Question1 {
	
	//Method to sort an Array
	public void bubbleSort(int[] array) {
		
		//boolean sorted = true;
		for(var i = 0; i < array.length-1; i++) { // iterating over the given array
			for(var j = 0; j < array.length-1; j++ ) {
				if(array[j] > array[j + 1] ) {
					
					// swaps the indexes according to the sizes
					var temp = array[j];
					array[j] = array[j + 1];
					array[j+1] = temp;
					
					
				}
				
			}
			
		}
	
		System.out.println(Arrays.toString(array));	
		
	}
	

}
