package com.brite.amazon.datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class EvenFollowedbyOddInArray {
	
public int[] sortArrayByParity(int[] A) {
	
	List<Integer> even = new ArrayList<>();
	List<Integer> odd = new ArrayList<>();
	List<Integer> merge = new ArrayList<>();
	for (int i:A) {
		if (i%2==0) {
			even.add(i);
		}else {
			odd.add(i);
		}
	}
	merge.addAll(even);
	merge.addAll(odd);
	int[] result = new int[merge.size()];
	int count=0;
	for (int i:merge) {
		result[count]=i;
		count++;
	}
	return result;
        
    }
	
	

	public static void main(String[] args) {
		int[] input = {3,1,2,4};
		EvenFollowedbyOddInArray e = new EvenFollowedbyOddInArray();
		for (int i:e.sortArrayByParity(input)) {
			System.out.print(" "+i);
		}
		
		
		
	}

}
