package com.brite.amazon.datastructures.binarySearch;

public class BinarySearch01 {
	int[] array;
	private int[] QuickSort(int[] input){
		this.array = input;
		int len = this.array.length;
		quicSort(0,len-1);
		return array;
		
		
	}

	
	private void quicSort(int lowerIndex, int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = this.array[lowerIndex+(higherIndex-lowerIndex)/2];
		
		while (i<=j){
			while (this.array[i]<pivot){
				i++;
			}
			while (this.array[j]>pivot){
				j--;
			}
			if(i<=j){
				//swap
				array[i]=array[i]^array[j]^(array[j]=array[i]);
				i++;
				j--;
			}
			if(lowerIndex<j){
				quicSort(lowerIndex,j);
			}
			if(i<higherIndex){
				quicSort(i,higherIndex);
			}
		}
	}
	
	public void binarySearchNum(int[] input,int data){
		int[] sortedArray = QuickSort(input);
		this.printArray(sortedArray);
		int higherIndex = sortedArray.length;
		int lowerIndex = 0;
		boolean search = true;
		while (search){
			int midIndex =lowerIndex+(higherIndex-lowerIndex)/2;
			int pivot = sortedArray[lowerIndex+(higherIndex-lowerIndex)/2];
			if (data==pivot){
				System.out.println(" Data found at location "+(midIndex+1));
				search = false;
				
			}
			if (data<pivot){
				higherIndex =midIndex-1; 
			}
			if(data>pivot){
				lowerIndex = midIndex+1;
			}
		}
	}
	private void printArray(int[] array){
		for (int i:array){
			System.out.print(" "+i);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		BinarySearch01 bs = new BinarySearch01();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 55, 99, 53, 12, 100, 52 };
		bs.binarySearchNum(input, 20);
		

	}

}
