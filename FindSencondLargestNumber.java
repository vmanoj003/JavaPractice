package com.java.debuggingExamples;

import java.util.Arrays;

public class FindSencondLargestNumber {
	
	
	
	public static void getLargestNumabr(int[] arr) {
		for(int j=0;j<arr.length-1;j++) {
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
			}
			 
		}
		
		 
	}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Largest Number is: " +arr[arr.length-2]);
	}
	public static void main(String[] args) {
		
		int[] a = {75,46,9,36,1,56,1,57,87};
		
		getLargestNumabr(a);
		
	}

}
