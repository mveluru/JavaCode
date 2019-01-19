package com.brite.amazon.datastructures.binarySearch;

public class BinarySearch {
	
	//Sort the array and do binary search
	/*Procedure binary_search
	   A ← sorted array
	   n ← size of array
	   x ← value to be searched
	
	   Set lowerBound = 1
	   Set upperBound = n 
	
	   while x not found
	      if upperBound < lowerBound 
	         EXIT: x does not exists.
	   
	      set midPoint = lowerBound + ( upperBound - lowerBound ) / 2
	      
	      if A[midPoint] < x
	         set lowerBound = midPoint + 1
	         
	      if A[midPoint] > x
	         set upperBound = midPoint - 1 
	
	      if A[midPoint] = x 
	         EXIT: x found at location midPoint
	   end while
	   
	end procedure
	
	 * 
	 */
	public int[] bubbleSort(int[] array) {
		int len = array.length;
		for (int m = len - 1; m >= 0; m--) {
			for (int i = 0; i <len-1; i++) {
				int k = i + 1;
				if (array[i] > array[k]) {
					// swap
					array[i] = array[i] ^ array[k] ^ (array[k] = array[i]);

				}
			}// inner loop
		}// outer loop
		for(int i:array){
			System.out.print(" "+i);
		}
		return array;
	}
	public void binarySearchNum(int[]array ,int data){
		int[] sortedArray = bubbleSort(array);
		int upperIndex = sortedArray.length-1;
		int lowerIndex =0;
		
		
		boolean search = true;
		while (search){
			int midIndex =lowerIndex+(upperIndex-lowerIndex)/2;
			if(sortedArray[midIndex]== data){
				System.out.println("\nData Found at location "+midIndex);
				search = false;
			}
			if(data < sortedArray[midIndex]){
				upperIndex=midIndex-1;			
			}
			
			if(data > sortedArray[midIndex]){
				lowerIndex = midIndex+1;
			}
			
		}
	}
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 55, 99, 53, 12, 100, 52 };
		bs.binarySearchNum(input, 2);
	}
}
