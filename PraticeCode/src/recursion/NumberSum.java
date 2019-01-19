package com.brite.amazon.recursion;

public class NumberSum {
	int total=0;
	
	private void sum(int num){
		
		if(num==0){
			System.out.println("The givn number is "+num);
		}else{
			 total =total+ num%10;
			 sum(num / 10);
		}
	}
public static void main(String[] args) {
	NumberSum ns = new NumberSum();
	ns.sum(234567);
	System.out.println(ns.total);
}
}
