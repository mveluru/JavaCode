package com.brite.amazon.datastructures.sorting;

public class QuickSort05 {
	int[] array;

	public void quickSort(int[] input) {
		this.array = input;
		int length = array.length;
		quicSort(0, length - 1);

	}

	public void quicSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				array[i] = array[i] ^ array[j] ^ (array[j] = array[i]);
				i++;
				j--;
			}
			if (lowerIndex < j) {
				quicSort(lowerIndex, j);

			}
			if (i < higherIndex) {
				quicSort(i, higherIndex);
			}
		}

	}

	public static void main(String[] args) {
		QuickSort05 sorter = new QuickSort05();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 55, 99, 53, 12, 100, 52 };
		sorter.quickSort(input);
		System.out.println(" Final Sorting Result");
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
