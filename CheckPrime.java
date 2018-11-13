package com.java.debuggingExamples;
import java.util.*;
public class CheckPrime {
	
	
	public static boolean isPrime(int num) {
		
		boolean isPrime = true;
		
		if(num <= 1) {
			
			isPrime = false;
			return isPrime;
		}else {
			for(int i=2;i<=num/2;i++) {
				if((num%i) == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
		
		 
		
	}
	
	public static void listOfPrimesBWNumbers(int a,int b){
		List<Integer> list = new ArrayList<>();
		
		int count = 0;
		
		for(int i=a;i<=b;i++) {
			if(i<=1) {
				System.out.println("invalid input");
				break;
			}else {
				for(int j = 2;j<i/2;j++) {
					if((i%j) == 0) {
						break;
					}else {
						count++;
						System.out.println(i);
						break;
					}
				}
			}
		}
		 
	}
	
	
	public static void primeCount(int num) {
		
		int count=0;
		
		int num2 = num;
		int sum=0;
		
		if(num<=1) {
			System.out.println("invalid input");
		}else {
			while(count<=10) {
				if(isPrime(num)) {
					count++;
					sum+=num;
					
					System.out.println(num);
					num++;
				}else {num++;}
				 
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		 
		
		if(isPrime(2)) {
			System.out.println("given number is prime");
		}else {
			System.out.println("given number is not prime number");
		}
		
		//listOfPrimesBWNumbers(10,20);
		primeCount(25);
	}

}
