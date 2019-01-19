package come.brite.other;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromUnsortedArray {

	private static List<Integer> removeDuplicates(int[] a) {
		List<Integer> intList = new ArrayList<>();
		for (int i : a) {
			if (!intList.contains(i)) {
				intList.add(i);
			}
		}

		return intList;

	}
	

public static void main(String[] args) {
	int arr[]= { 1, 2, 5, 1, 7, 2, 4, 2};
	List<Integer> intList = removeDuplicates(arr);
	for(int i:intList){
		System.out.print(" "+i);
	}
		
}

	
}
