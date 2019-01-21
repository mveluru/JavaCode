package com.brite.amazon.datastructures.array;

public class LongestSubArrayWithEvenElements {

	public static void printLongEvenArray(int[] array) {
		int ans = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;

			}
		}
  System.out.println(count);
	}

	public static void main(String[] args) {
		int arr[] = { 9, 8, 5, 1, 6, 6, 6, 6, 6, 4, 4, 4, 2, 4, 1, 6, 6, 6, 6,
				6, 4, 4, 4, 2, 4, 6, 6, 6, 6, 6, 4, 4, 4, 2, 4,6, 4, 4, 4, 2, 4, 6, 6, 6, 6, 6, 4, 4, 4, 2, 4 };

		printLongEvenArray(arr);
	}
}
