package com.brite.amazon;

public class Largest_subarraywith0sum {
	
	public void sum0MaxLength(int[] a){
		int maxLen=0;
		for (int i=0;i<a.length;i++){
			int sum=0;
			for (int j=i;j<a.length;j++){
				sum +=a[j];
				if(sum==0){
					maxLen= Math.max(maxLen,j-i+1);
				}
			}
			
		}
		System.out.println(maxLen);
	}


	public static void main(String[] args){
		int[]arr = {15, -2, 2, -8, 1, 7, 10, 23};
		Largest_subarraywith0sum l = new Largest_subarraywith0sum();
		l.sum0MaxLength(arr);
		
	}
	
	
}
