package com.java.debuggingExamples;


import java.util.*;

public class SeperateZerosFromNonZeros {
	
public static int[] moveZerosToEnd(int[] arr,String st) {
	
	int[] arr1 = new int[arr.length];
	int[] arr2 = new int[arr.length];
	
	if(st.equals("left")) {
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			
			 
			
			if(arr[i] != 0) {
				arr1[count++] = arr[i];
			}	
			
		}
		
		while(count < arr.length) {
			arr1[count++] =0;
		}
		return arr1;
	}else {
		
		if(st.equals("right")) {
			
			int count = arr.length-1;
			for(int i=0;i<arr.length;i++) {
				
				 
				
				if(arr[i] != 0) {
					arr2[count--] = arr[i];
				}	
				
			}
			
			while(count > arr.length) {
				arr2[count--] =0;
			}
		 
		
	}
		return arr2;
	}
	}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(moveZerosToEnd(new int[]{0,6,3,6,0,9,6,4,0},"left")));
		System.out.println(Arrays.toString(moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3},"left")));
		 
        System.out.println(Arrays.toString(moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1},"right")));
 
        System.out.println(Arrays.toString(moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4},"right")));
 
        System.out.println(Arrays.toString(moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4}, "left")));
		
	}

}
