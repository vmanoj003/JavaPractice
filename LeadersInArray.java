package com.java.debuggingExamples;

import java.util.*;


public class LeadersInArray {
	
	static List<Integer> list = new ArrayList<>();
	
	public static void findTheLeaders(int[] arr) {
		
		int numofRotation  = arr.length;
		 
		
		for(int i=0;i<arr.length-1;i++) {
			int count = 0;
			numofRotation--;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] > arr[j]) {
					count++;
					if(count == numofRotation) {
					list.add(arr[i]);
					}
				}
			}
		}
		
		list.add(arr[arr.length-1]);
		System.out.println("the leade elements are" + list);
	}
	
	
	
	public static void main(String[] args) {
		
		findTheLeaders(new int[] {14, 9, 11, 7, 8, 5, 3});
		
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		 
        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
 
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
 
        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
		
	}

}
