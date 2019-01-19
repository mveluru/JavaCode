package com.brite.sorting;

public class BubbleSort {
	private static void bubbleSorting(int[] input){
		for (int m = input.length-1; m >= 0; m--) {
		for (int i=0;i<input.length-1;i++){
			int k= i+1;
			if(input[i]>input[k]){
				int temp = input[i];
				input[i]=input[k];
				input[k]= temp;
			}
		}
		
		}
		for(int i:input){
			System.out.print(" "+i);
		}
	}
	
	public static void main(String[] args) {
		  int[] input = { 4, 2, 9,8, 6, 23, 12, 34, 0, 1 };
		  bubbleSorting(input);
	  
	}

}
