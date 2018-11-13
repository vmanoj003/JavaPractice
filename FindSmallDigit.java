package com.java.debuggingExamples;

public class FindSmallDigit {
	

	public static void getNextSammNumber(int n, int digit) {
		
		String s1 = String.valueOf(digit);
		
		for(int i=n;i>0;i--) {
			String s = String.valueOf(i);
			
			if(!s.contains(s1)) {
				System.out.println("the next smallest number which does not contain the digit:"+ s);
				break;
			}
			
	}
	}
	
 

	public static void main(String[] args) {
		
		getNextSammNumber(123,2);
		getNextSammNumber(4582,5);
		getNextSammNumber(98512,5);
		getNextSammNumber(548624,8);
		 
	}

}
