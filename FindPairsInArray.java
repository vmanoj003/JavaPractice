package com.java.debuggingExamples;
import java.util.*;



public class FindPairsInArray {
	
	public static void findPairs(int[] a, int digit) {
		
		 
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
				
				
				if(a[i]+a[j] == digit) {
					
					System.out.println("The Pairs are (" + a[i] + ","+ a[j] + ")");
				}
				
				
			}
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		int[] b = {54,3,67,33,98,2,9};
		findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
		findPairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
		findPairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
		
		
		findPairs(b,100);
		
		
		 
		
	}

}
