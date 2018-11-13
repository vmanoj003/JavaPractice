package com.java.debuggingExamples;

import java.util.Arrays;
import java.util.List;

public class AnagramOrNot {
	
	
	@SuppressWarnings("unused")
	public static void isAnagram(String a, String b) {
		
		String[] c = a.split("");
		String[] d = b.split("");
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		List<String> list = Arrays.asList(d);
		
		
		for(int i=0;i<=c.length-1;i++) {
			
			System.out.println(c[i]+":"+list.contains(c[i]));
			
			if(!list.contains(c[i])) {
				
				System.out.println("inputs are not anagram" + c[i]);
				break;
			}
		}
		
		 
	}
	
	
	public static void main(String[] args) {
		
		
		isAnagram("mother in law","hitler woman");
		
		
	}

}
