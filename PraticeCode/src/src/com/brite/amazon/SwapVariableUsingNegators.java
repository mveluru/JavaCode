package com.brite.amazon;

public class SwapVariableUsingNegators{
	
	public static void main(String[] args) {
		int x,y;
		x=5;
		y=10;
		x =x^y ^(y=x);
		System.out.println("x=" +x + " Y="+y);
		
	}
	
}
