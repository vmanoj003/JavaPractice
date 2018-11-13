package com.java.debuggingExamples;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {
	
	Map<String,Integer> map = new HashMap<>();
	Map<String,Integer> duplicates = new HashMap<>();
	Map<String,Integer>  unique= new HashMap<>();
	public void Duplicates(String a) {
	
	String[] array = a.split("");
	
	for(int i=0;i<array.length;i++) {
		
		if(map.containsKey(array[i])) {
			map.put(array[i],(map.get(array[i])+1));
		}else {
			map.put(array[i], 1);
		}
			
	}
	
for(int i=0;i<array.length;i++) {
		
		if(map.get(array[i])>1) {
			
			duplicates.put(array[i],map.get(array[i]));
			
		}else {
			unique.put(array[i],1);
			
		}	
	}
	
System.out.println("map"+ map);
System.out.println("Duplicates" + duplicates);
System.out.println("unique"+unique);
	}
	
	public static void main(String[] args) {
		
		
		DuplicatesInString b = new DuplicatesInString();
		
		b.Duplicates("Manojkumar Velama");
		
		
	}

}
