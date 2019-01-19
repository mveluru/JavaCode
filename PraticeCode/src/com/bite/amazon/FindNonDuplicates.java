package com.bite.amazon;

import java.util.Arrays;


/*
 * An Array arr={7, 7, 8, 8, 9, 1, 1, 4, 2, 2} has numbers appearing twice or once.
 *  Duplicates appear side by side everytime. Might be few numbers can be occur one time and just assume this is a right rotating array 
 * (just say an array can rotate k times towards right). Aim is to identify numbers that occurred once in array.
 */
public class FindNonDuplicates {
	
	
	private void findNonDuplicates(int[] a){
		
		for (int i=0;i<a.length;i++){
			if (i+1 > a.length -1 ){
				break;
			}
			if ((a[i]==a[i+1])){
				int b[]=Arrays.copyOfRange(a, i+2, arg2)
				findNonDuplicates(b);
			}else{
				System.out.println(a[i]);
				int b[]=Arrays.copyOf(a, i+1);
				findNonDuplicates(b);
			}
		}
		
	}
public static void main(String[] args) {
	int a[] = { 7, 7, 8, 8, 9, 1, 1, 4, 2, 2 };
	FindNonDuplicates findNonDuplication = new FindNonDuplicates();
	findNonDuplication.findNonDuplicates(a);
}
}
