package com.brite.amazon.datastructures.array;

public class Sum9 {

	 public int[] twoSums(int[] numbers, int target) {
		  
	           for (int i=0;i<numbers.length;i++){
	        	   for (int j=i+1;j<numbers.length;j++){
	        		   if(numbers[i]+numbers[j]==target){
	        			 return new int[]{i,j};
	        		   }
	        	   }
	           }
	      
	           throw new IllegalArgumentException("No two sum solution");
	    }
	//Leetcode
	 public int[] twoSum(int[] nums, int target) {
		    for (int i = 0; i < nums.length; i++) {
		        for (int j = i + 1; j < nums.length; j++) {
		            if (nums[j] == target - nums[i]) {
		                return new int[] { i, j };
		            }
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
	
	public static void main(String[] args) {
		int[] numbers ={2,7,11,15} ;
		int target =9;
		
		Sum9 s9 = new Sum9();
		s9.twoSum(numbers, target);

	}

}
