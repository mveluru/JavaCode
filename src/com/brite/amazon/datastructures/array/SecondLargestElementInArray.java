package com.brite.amazon.datastructures.array;

public class SecondLargestElementInArray {
	
	public static void findSecondLargest(int[] array){
		int len = array.length;
		int i=0;
		int largest = array[0];
		int secondLarge=array[0];
		while (i<len){
			if (array[i]>largest){
				secondLarge = largest;
				largest = array[i];
			}else if(array[i]>secondLarge){
				secondLarge = array[i];
			}
			i++;
		}
		System.out.println(" Second Large Number "+secondLarge);
		System.out.println(" MaxNumber "+largest);
	}
	
	public static void main(String[] args) {
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		findSecondLargest(arr);
	}

}
