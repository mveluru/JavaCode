package com.brite.amazon;

import java.util.Arrays;
import java.util.HashMap;
/*
 * Time Complexity : O(nlog n) Space Complexity: O(n) by using merge sort.
 */
public class FindDuplicatesUsingSorting {
	public void hasDuplicatesUsingSorting(int [] arrA) {
        Arrays.sort(arrA);
        for (int i = 0; i < arrA.length-1; i++) {
            if(arrA[i]==arrA[i+1]){
                System.out.println("Array has duplicates : " + arrA[i]);
            }
        }
    }
	
	/*
	 * Time Complexity : O(n) and Space Complexity: O(n).
	 */
	   public void hasDuplicatesUsingMap(int [] arrA){
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i <arrA.length ; i++) {
	            if(map.containsKey(arrA[i])){
	                System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
	            }else{
	                map.put(arrA[i], 1);
	            }
	        }
	    }

	public static void main(String[] args) {
		 int a [] = {1, 6, 5, 2, 3, 3, 2};
	        new FindDuplicatesUsingSorting().hasDuplicatesUsingSorting(a);
	        new FindDuplicatesUsingSorting().hasDuplicatesUsingMap(a);

	}

}
