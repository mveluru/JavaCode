package com.brite.amazon.datastructures.sorting;

public class BubbleSort02 {

	private static void bubbleSorting(int[] input) {
		int n = input.length;
		for(int m=n-1;m>=0;m--){
			for(int i=0;i<n-1;i++){
				int k = i+1;
				if (input[i]> input[k]){
					input[i]= input[i]^input[k]^(input[k]=input[i]);
				}
			}
		}
		for (int i:input){
			System.out.print(" "+i);
		}
	}

	public static void main(String[] args) {
		 int[] input = { 4, 2, 9,8, 6, 23, 12, 34, 0, 1 };
		  bubbleSorting(input);
	}

}
