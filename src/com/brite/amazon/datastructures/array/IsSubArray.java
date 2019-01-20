package com.brite.amazon.datastructures.array;

public class IsSubArray {
	public static boolean findSubArray(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (a[i] == b[j]) {
				i++;
				j++;

				if (j == m) {
					return true;
				}
			} else {
				i++;
				j = 0;
			}

		}

		return false;

	}

	public static void main(String[] args) {

		int A[] = { 8, 1, 2, 3, 4, 5, 6, 7 };
		int B[] = { 2, 3, 4, 5 };

		if (findSubArray(A, B))
			System.out.println("YES\n");
		else
			System.out.println("NO\n");

	}

}
