package com.java.debuggingExamples;

public class DecimalToXformatConversions {
	
	public static void decimalToBinary(int decimal) {
		
		String s ="";
		
		while(decimal>0) {
			
			s+=decimal%2;
			decimal = decimal / 2;
		}
		
		System.out.println(s);
	}
	
	public static void decimalToOcatal(int decimal) {
		
		String s = "";
		int rem = 0;
		
		while(decimal>0) {
			
			rem = decimal%8;
			s+=rem;
			decimal = decimal / 8;
		}
		System.out.println(s);
	}
	
	public static void decimalToHexa(int decimal) {
		
		char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String s = "";
		int rem = 0;
		
		while(decimal>0) {
			
			rem = decimal%16;
			s+=hexaDecimals[rem];
			decimal = decimal / 16;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		decimalToBinary(50);
		decimalToOcatal(1000);
		decimalToHexa(2000);
		
		
	}

}
