package com.java.debuggingExamples;

public class Sample {
	
	
	public int mul(int a, int b) {
		
		return a*b;
	}
	
	
	public static void main(String[] args) {
		
		int c;
		Sample s = new Sample();
		
		c = s.mul(10,5); 
		
		System.out.println(c);
		
		
	}

}
