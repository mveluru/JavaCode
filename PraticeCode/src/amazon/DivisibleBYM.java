package com.brite.amazon;



public class DivisibleBYM {
	
	public void subSetsofArray(int[]a){
		int len = a.length;
		
		for (int i=0;i<len;i++){
			System.out.print(" "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] a ={1,2,3,4};
		DivisibleBYM d = new DivisibleBYM();
		d.subSetsofArray(a);
	}
}
