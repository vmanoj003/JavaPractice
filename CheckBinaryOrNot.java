package com.java.debuggingExamples;

public class CheckBinaryOrNot {
	
	
	public static void isBinary(long number) {
		
		out:while(number > 0) {
			
			long n = number % 10;
			
			if(n>1) {
				
				System.out.println("invalid input");
				break out;
			}
			
			number = number / 10;
			}
		
		//System.out.println("input number is binary");
		}
	
	
	
	public static void main(String[] args) {
		
		
		isBinary(1010140100L);
		
		
	}

}
