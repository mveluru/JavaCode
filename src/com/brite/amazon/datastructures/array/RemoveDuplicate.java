package com.brite.amazon.datastructures.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public void removedup(int[] a, int[] b) {
		List<Integer> mergeList = new ArrayList<>();
		for (int i : a) {
			mergeList.add(i);
		}
		for (int i : b) {
			mergeList.add(i);
		}

		// Solution-1
		Set<Integer> remdups = new TreeSet<Integer>();
		for (int i : mergeList) {
			remdups.add(i);
		}
		System.out.println("solution-1");
		System.out.println(remdups);

		// Solution-2
		List<Integer> dupslist = new ArrayList<>();
		dupslist.addAll(mergeList);
		System.out.println("solution-2");
		dupslist.stream().sorted().distinct().forEach(i -> System.out.print(" " + i));

	}

	public static void main(String[] args) {
		int[] input1 = { 21, 20, 19, 18 };
		int[] input2 = { 9, 9, 8, 81, 2, 3, 4, 4, 5, 5, 6, 7, 7 };

		RemoveDuplicate rem = new RemoveDuplicate();
		rem.removedup(input1, input2);
	}
}
