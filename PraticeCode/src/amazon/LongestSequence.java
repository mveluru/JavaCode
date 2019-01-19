package com.brite.amazon;

public class LongestSequence {
	public int lengthOfLIS(int[] a) {
		int length = a.length;
		int bigCount =0;
		int count = 0;
		int i = 0;

		while (i < length-1) {
			if (a[i] < a[i + 1]) {
				count += 1;
			} else {
							
				count = 0;
			}
			if(bigCount<count){
				 bigCount=count;
			}
			i++;
		}
		return bigCount;
	}

	public static void main(String[] args) {
		int[] k = { 10, 9, 2, 5, 3, 7, 101, 18 };
		LongestSequence longestSequence = new LongestSequence();
		System.out.println(longestSequence.lengthOfLIS(k));
	}
}
