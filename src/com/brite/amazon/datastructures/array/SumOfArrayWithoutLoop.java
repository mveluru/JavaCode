package com.brite.amazon.datastructures.array;

import java.util.Arrays;

public class SumOfArrayWithoutLoop {
	 int sum=0;
	int count=0;
	public  int  sumOfArray(int[] input){
		int length = input.length;
		return sum = length*(length+1)/2;
	}

	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5};
		SumOfArrayWithoutLoop sum = new SumOfArrayWithoutLoop();
		System.out.println(sum.sumOfArray(arr));
		
		
		
	}
}
