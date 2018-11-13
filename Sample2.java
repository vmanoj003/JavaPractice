package com.java.debuggingExamples;

public class Sample2 {
	
	Sample s = new Sample();
	
	public void add(int c,int d) {
		
		int f = s.mul(c,d);
		
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		
		
		Sample2 s2 = new Sample2();
		
		s2.add(57,113);
		
	}

}
