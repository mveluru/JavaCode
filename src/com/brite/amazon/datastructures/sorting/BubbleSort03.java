package com.brite.amazon.datastructures.sorting;

public class BubbleSort03 {
	public static void bubbleSort(int[] array){
		int len = array.length;
		for (int m = len-1;m>=0;m--){
			for(int i=0;i<len-1;i++){
				int k= i+1;
				if(array[i]>array[k]){
					array[i]=array[i]^array[k]^(array[k]=array[i]);
				}
			}
		}
		for (int i:array){
			System.out.print(" "+i);
		}
	}

	public static void main(String[] args) {
		int[] input ={9,8,7,6,5,4,3,2,1,0};
		bubbleSort(input);

	}

}
