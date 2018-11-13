package com.java.debuggingExamples;

public class PalindromeOfNumber {
	
	public static boolean isPilondramorNot(int number) {
		
		boolean ispilondram = true;
		int n = String.valueOf(number).length()/2;
		String[] st = String.valueOf(number).split("");
		int k = st.length-1;
		loop: for(int i = 0;i<n;i++) {
			if(!st[i].equals(st[k--])) {
				ispilondram = false;
				break loop;
				
			}
		}
		return ispilondram;
	}
	
	public static int getPilondram(int input) {
		
		StringBuffer bf = new StringBuffer(String.valueOf(input));
		int sum = input;
		String s = bf.reverse().toString();
		sum+=Integer.parseInt(s);
		
		kip:while(!isPilondramorNot(sum)) {
			
			System.out.println("input");
			getPilondram(sum);
			
		}
		
		return sum;
		
		
	}
	
	public static int findPilondram(int number) {
		
		StringBuffer bf = new StringBuffer(String.valueOf(number));
		int input = 0;
		 if(isPilondramorNot(number)) {
			 
			 return number;
		 }else {
			 
			 return getPilondram(number);
			 
		 }
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(findPilondram(7325));
		
	}

}
