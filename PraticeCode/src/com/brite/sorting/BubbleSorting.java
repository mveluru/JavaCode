package com.brite.sorting;

public class BubbleSorting {
	
	public static void bubbleSorting(int[] array){
		int n= array.length;
		for (int m = n-1; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				int k = i + 1;
				if (array[i] > array[k]) {
					int temp = array[k];
					array[k] = array[i];
					array[i] = temp;
				}
			}
			for(int i=0;i<array.length;i++){
				System.out.print(" "+ array[i]);
			}
			System.out.println("\n");
		}
		
	}
	
	public static void main(String[] args) {
		  int[] input = { 4, 2, 9,8, 6, 23, 12, 34, 0, 1 };
		  bubbleSorting(input);
	  
	}
}
