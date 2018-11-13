package com.java.debuggingExamples;

public class StringReversal {
	
	String reversedString = "";
	String reverseOrder = "";
	String NoWhiteSpaces = "";
	
	public String reverseTheString(String s) {
		
		String[] array = s.split("");
		
		for(int i=array.length-1;i>=0;i--) {
			
			reversedString+=array[i]+" ";
			
		}
		
		return reversedString;
	}
	
	public String reverseOrder(String s) {
		
		String[] s1 = s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--) {
			
			reverseOrder+=s1[i]+" ";
			
		}
		
		return reverseOrder;
	}
	
	
	public String stripWhiteSpacesInString(String s) {
		
		String[] s2 = s.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			
			NoWhiteSpaces+=s2[i];
			
		}
		
		return NoWhiteSpaces;
	}
	
	public static void main(String[] args) {
		
		StringReversal reversalObject = new StringReversal();
		
		String d = reversalObject.reverseTheString("manoj kumar velama");
		
		System.out.println(d);
		
		String d1 = reversalObject.reverseOrder("Manoj kumar Velama");
		
		System.out.println(d1);
		
		String s2 = reversalObject.stripWhiteSpacesInString("Manoj kumar Velama");
		
		System.out.println(s2);
	}

}
