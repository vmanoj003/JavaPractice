package com.java.debuggingExamples;
import java.util.*;

public class RemoveDuplicatesInArrayList {
	
	
	public static List<String> removeDuplicates(List<String> list) {
		
		List<String> list1 = new ArrayList<>();
		
		for(String s: list) {
			
			if(!list1.contains(s)) {
				
				list1.add(s);
			}
			
		}
		
		return list1;
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Manojkumar");
		list.add("manoj");
		list.add("kumar");
		list.add("manoj");
		list.add("kumar");
		System.out.println(removeDuplicates(list));
		
	}

}
