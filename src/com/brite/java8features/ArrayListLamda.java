package com.brite.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListLamda {
	public static void main(String[] args) {

		List<Integer> alist = new ArrayList<>();
		alist.add(8);
		alist.add(3);
		alist.add(5);
		alist.add(4);
		alist.add(1);

		alist.forEach((i) -> {
			System.out.print(" " + i);
		});
     Comparator<Integer> comp = (i1,i2)->{
		return i1.compareTo(i2);
    	 
     };
     Collections.sort(alist, comp);
     System.out.println("\nSORTED");
     alist.forEach((i) -> {
			System.out.print(" " + i);
		});
     
	}
	
}
