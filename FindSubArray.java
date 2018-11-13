package com.java.debuggingExamples;

public class FindSubArray {
	
	public static void findSubArray(int[] a, int digit) {
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			
			sum =a[i];
			
			for(int j=i+1;j<a.length;j++) {
				
				sum+=a[j];
				
				if(sum == digit) {
					
					for(int k=i;k<=j;k++) {
						System.out.print(a[k]+"  ");
						
					}
					System.out.println();
				}else if(sum<digit) {
					
					continue;
					
				}else if(sum>digit) {
					
					break;
				}
				
			}
			 
		}
	}
	
	 
	public static void main(String[] args) {
		
		findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
		 
        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
 
        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
		
	}

}
