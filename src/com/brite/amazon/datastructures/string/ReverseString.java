package com.brite.amazon.datastructures.string;

public class ReverseString {
	
	private String usingStringBuilder(String s){
		
	        StringBuilder input1 = new StringBuilder(); 
	  
	        // append a string into StringBuilder input1 
	        input1.append(s); 
	  
	        // reverse StringBuilder input1 
	        input1 = input1.reverse(); 
	  
	        // print reversed String 
	        return input1.toString();
	}
	
	private String usingCharArray(String s){
		char[] carray =s.toCharArray();
		StringBuilder input = new StringBuilder();
		for (int i= carray.length-1;i>=0;i--){
			
			 input.append(carray[i]);
			
		}
		return input.toString();
	}
	
	 public static void main(String[] args){
		 
		 ReverseString rs = new ReverseString();
		 
		 System.out.println("Using String Builder Reverse  "+rs.usingStringBuilder("Murali"));
		 System.out.println("Using charArray Reverse  "+rs.usingCharArray("Murali"));
	 }
}
