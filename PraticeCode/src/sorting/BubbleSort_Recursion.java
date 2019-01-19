package com.brite.amazon.datastructures.sorting;

public class BubbleSort_Recursion {
	
	 public static boolean isSorted(int [] a, int start){
	        if(start==a.length-1)
	            return true;
	        if(a[start]<=a[start+1])
	        	
	            return isSorted(a, start+1);
	        else
	            return false;
	    }

	public static void main(String[] args) {
		 int [] a = { 1,2,3,4,8,8,22,50};
	        System.out.println(isSorted(a,0));
	}

}
