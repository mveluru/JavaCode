package com.brite.amazon.datastructures.array;

public class MissingNumber {
	
	//n(n+1)/2 
	public void missingNumberinSeq(int[] input){
		int n = input.length;
		int sum = n*(n+1)/2;
		System.out.println(sum);
		
	}
	public void missingNumberinSeq01(int[] input){
		int n = input.length;
		int sum = (n+1)*(n+2)/2;
		System.out.println(sum);
		for(int i=0;i<n;i++){
			sum = sum - input[i];
		}
		System.out.println("Missing Number is "+sum);
	}
	
	public void missingNumberInSeq02(int[] input) {
		int n = input.length;
		int sum = ((n+1)*(n+2))/2;
		System.out.println("sum " +sum);
		for(int i=0;i<input.length;i++) {
			sum = sum -input[i];
		}
		System.out.println(sum);
	}
	
	
	
	public int getsum(int[] array){
		int n = array.length;
		int sum = ((n+1) * (n+2))/2;
		return sum;
	}
	
	public void missingNum(int[] array){
		int sum = getsum(array);
		
		for(int i:array){
			sum  = sum -i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[]args){
		int[] input ={1,2,3,4,5};
		int[] input01 ={1,2,3,4,5,7,8,9,10};
		int[] numarray = new int[] {1, 2,5, 6, 3, 7, 8};
		MissingNumber mn = new MissingNumber();
		/*
		 * mn.missingNumberinSeq(input); mn.missingNumberinSeq01(input01);
		 * mn.missingNum(numarray);
		 */
		mn.missingNumberInSeq02(numarray);
		
	}

}
