package com.java.debuggingExamples;

import java.util.Stack;

public class BalencedString {
	
	public boolean isBalenced(String s) {
		
		char[] array = s.toCharArray();
		
		Stack<Character> st = new Stack<>();
		
		
		for(int i=0;i<array.length;i++) {
			
			switch(array[i]) {
			
			case '{':
			case '(':
			case '[':
				st.push(array[i]);
				break;
			case '}':
				if(st.isEmpty() || st.pop() != '{') 
					return false;
				break;
				
			case ')':
				if(st.isEmpty() || st.pop() != '(') 
					return false;
				break;
				
			case ']':
				if(st.isEmpty() || st.pop() != '[') 
					return false;
				break;
				 
					
			}
		}
		
		
		return st.isEmpty();
	}
	
	
	public static void main(String[] args) {
		
		BalencedString s = new BalencedString();
		
		if(s.isBalenced("[({})]")) {System.out.println("given String is balenced String");}
		else{System.out.println("given String is not balenced String");}
		
	}

}
