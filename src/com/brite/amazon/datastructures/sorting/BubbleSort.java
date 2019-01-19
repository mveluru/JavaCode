package com.brite.amazon.datastructures.sorting;

public class BubbleSort {
	
	public static void bubbleSorting(int[] input){
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
	
	public static void bubbleSorting01(int[] input){
	
		for(int m = input.length-1 ;m>=0;m--){
			for (int i=0;i<input.length-1;i++){
				int k = i+1;
				if (input[i]>input[k]){
					input[i]= input[i]^input[k] ^(input[k]=input[i]);
					
				}
			}
			
		}
		for(int i:input){
			System.out.print(" "+i);
		}
	}
	
	public static void bubbleSorting02(int[] a){
		for(int m=a.length-1;m>= 0;m--){
			for(int i=0;i<a.length-1;i++){
				int k =i+1;
				if(a[i]> a[k]){
					a[i]=a[i]^a[k]^(a[k]=a[i]);
				}
			}
		}
		for (int j:a){
			System.out.print(" "+j);
		}
	}
	public static void bubbleSorting03(int[] a){
		int n= a.length;
		for (int m = n-1;m>=0;m--){
			for (int i=0;i<n-1;i++){
				int k = i+1;
				if (a[i]> a[k]){
					a[i]=a[i]^a[k]^(a[k]=a[i]);
				}
			}
		}
		for(int i:a){
			System.out.print(" "+i);
		}
		
	}
public static void main(String[] args) {
	  int[] input = { 4, 2, 9,8, 6, 23, 12, 34, 0, 1 };
	  bubbleSorting(input);
	  System.out.println("\n bubbleSorting01");
	  bubbleSorting01(input);
	  System.out.println("\n bubbleSorting02");
	  bubbleSorting02(input);
	  System.out.println("\n bubbleSorting03");
	  bubbleSorting03(input);

}
}
