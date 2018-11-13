package com.java.debuggingExamples;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations {
	
	
	public static void matrixAddition(int[][] a,int[][] b) {
		
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a[1].length;j++) {
				
				
				
			}
		}
		
		 System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numebr of rows");
		
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of coloumn");
		
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		int[][] matrix1 = new int[rows][cols];
		
		System.out.println("enter your matrix data");
		for(int i=0;i<matrix[0].length;i++) {
			for(int j=0;j<matrix[1].length;j++) {
				
				
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		//matrixCreation(matrix);
		
		System.out.println("enter second matrix data :");
		
		
		for(int i=0;i<matrix[0].length;i++) {
			for(int j=0;j<matrix[1].length;j++) {
				
				
				matrix1[i][j] = sc.nextInt();
			}
			
			System.out.println();
		}
		
		
	}

}
