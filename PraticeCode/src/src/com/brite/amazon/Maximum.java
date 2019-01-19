package com.brite.amazon;

public class Maximum {
	
	public void findMax(int[] input){
		int i = 0;
		int j= input.length-1;
		int lowerIndexNumber=0;
		int higherIndexNumber=0;
		while (i<j){
			lowerIndexNumber = (input[i] > lowerIndexNumber)? input[i]:lowerIndexNumber;
			higherIndexNumber = (input[j]> higherIndexNumber)? input[j]:higherIndexNumber;
			i++;
			j--;
		}
		System.out.println("lowerIndexNumber "+lowerIndexNumber);
		System.out.println("higherIndexNumber "+higherIndexNumber);
	}

	public static void main(String[] args) {
		int[] input ={2,6,4,8,10,7,12,11};
		Maximum max = new Maximum();
		max.findMax(input);;
		
	}
}
