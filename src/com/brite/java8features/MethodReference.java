package com.brite.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
	
	public  void printSomething() {
		System.out.println("This is Method reference");
	}

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList = Arrays.asList(9,8,7,6,5);
		int total = intList.stream().filter((i)->i>6).mapToInt(i -> i).sum();
		
		System.out.println(total);
		
		List<Integer> intList1 = new ArrayList<>();
		intList1 = Arrays.asList(9,8,7,6,5,9);
		
		List<Integer> SortList = intList1.stream().distinct().sorted().collect(Collectors.toList());
		SortList.forEach(i->{System.out.print(" "+i);});
		System.out.println();
		SortList.forEach(System.out::println);
		
		long count = intList1.stream().filter((i)->i>7).count();
		
		List<Integer> even = intList1.stream().filter((i)->i %2==0).collect(Collectors.toList());
		
		List<String> Stinglist = Arrays.asList("java", "python", "nodejs", "ruby");
		String joingstring = Stinglist.stream().collect(Collectors.joining("|"));
		
		System.out.println(joingstring);
						
		
	}

}



