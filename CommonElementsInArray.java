package com.java.debuggingExamples;


import java.util.*;

public class CommonElementsInArray {
	
	
	public static Set<String> getCommonElements(String[] s, String[] s1){
		
		List<String> list1 = new ArrayList<>(Arrays.asList(s));
		List<String> list2 = new ArrayList<>(Arrays.asList(s1));
		
		Set<String> list = new HashSet<>();
		
		for(String s4: list1) {
			
			if(list2.contains(s4)) list.add(s4);
		}
	
		return list;
	}
	
	
	public static void main(String[] args) {
		
		
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s3 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        System.out.println(getCommonElements(s1, s3));
	}

}
