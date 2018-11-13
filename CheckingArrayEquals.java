package com.java.debuggingExamples;

import java.util.Arrays;
import java.util.*;

public class CheckingArrayEquals {
	
	
	public static void equalsOrNot(String[] a, String[] b) {
		
		 
		 
		
		List<String> e = Arrays.asList(b);
		
		for(int i=0;i<a.length-1;i++) {
			if(!e.contains(a[i])) System.out.println("Arrays or not equal"); 
			break;
		}
		 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] c = {"manoj","1","kumar"};
		String[] d = {"kumar","1","manoj1"};
		equalsOrNot(c,d);

	}

}
