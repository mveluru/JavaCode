package com.brite.amazon.datastructures.array;

public class OddNumberSqr {
	
	public static void main(String[] args) {
		int number = 299792458;
		char[] charArray = Integer.toString(number).toCharArray();
		for(char ch:charArray) {
			int digit = ch -'0';
			System.out.println(digit * digit);
		}
		
	}

}
