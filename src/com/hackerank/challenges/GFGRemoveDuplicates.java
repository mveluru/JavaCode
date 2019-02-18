package com.hackerank.challenges;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GFGRemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2};
		
		List<Integer> arrayList = Arrays.asList( 1, 2, 5, 1, 7, 2, 4, 2);
		
		 arrayList.stream().sorted().distinct().forEach((i)->{System.out.print(" "+i);});
		 
		 Map<Integer,Integer> map = new Hashtable<>();
		 for (Integer i: arr) {
			 if (!map.containsKey(i)) {
				 map.put(i, 1);
			 }else {
				 int count = map.get(i);
				 map.put(i, ++count);
			 }
			
		 }
		
		 Iterator<Integer> dupcount = map.keySet().iterator();
		 while(dupcount.hasNext()) {
			 int key = dupcount.next();
			 
			if (map.get(key)>1)
				 System.out.println("\nkey "+key + " "+map.get(key));
			
		 }
	}
}
