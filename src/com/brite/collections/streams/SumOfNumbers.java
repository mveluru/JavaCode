package com.brite.collections.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
	public void sumOfOdder() {
		List<Integer> numbers = Arrays.asList(1,3,4,5,6,7,8,9,10);
		int sum = numbers.stream().filter(number->(number%2!=0)).reduce(0,Integer::sum);
		System.out.println(sum);
	}
public static void main(String[] args) {
	SumOfNumbers s = new SumOfNumbers();
	s.sumOfOdder();
}
}
