package com.java.debuggingExamples;

public class ArmstrongOrNot {
	
	
	public static void isArmstrong(int num) {
		
		int num1 = num;
		
		int length = String.valueOf(num).length();
		
		int sum = 0;
		
		
		while(num != 0) {
			
			int n = num%10;
			
			sum+= n*n*n;
			
			num = num/10;
			
		}
		
		
		System.out.println(sum);
		
		if(sum == num1) {
			System.out.println("inout is armstrong");
		}else {
			System.out.println("input is not armstrong");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		isArmstrong(153);
		
		
	}

}
