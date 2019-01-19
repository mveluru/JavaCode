package com.brite.amazon.datastructures.array;

/* Function to reverse arr[] 
from start to end*/
public class NoTInPlace_ReverseArray {

	public void reversedArray(int[] input){
		int len = input.length;
		int[]rev = new int[len];
		for(int i=0;i<len;i++){
			rev[len -i-1]=input[i];
		
		}
		for(int i=0;i<len;i++){
			input[i]=rev[i];
			System.out.print(" "+input[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7,8,9};
		NoTInPlace_ReverseArray  notinPlan = new NoTInPlace_ReverseArray();
		notinPlan.reversedArray(input);
		
	}
}
