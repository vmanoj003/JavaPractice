package com.java.debuggingExamples;

import java.util.Arrays;

public class StringReversa {
	
	public static void reverseString(String st) {
		
		char[] charArray = st.toCharArray();
		
		int j  = charArray.length -1;
		
		char[] result = new char[charArray.length];
		
		for(int i=0;i<charArray.length;i++) {
			
			if(charArray[i] == ' ') {
				result[i] = ' ';
			}
		}
		
		for(int i=0;i<charArray.length;i++) {
			
			
			if(charArray[i] != ' ') {
				
				if(result[j] == ' ' ) {
					j--;
				}
				result[j] = charArray[i];
				j--;
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	
	public static void main(String[] args) {
		
		
		
		reverseString("I Am Not String");
        
        reverseString("JAVA JSP ANDROID");
         
        reverseString("1 22 333 4444 55555");
		
		
	}

}
