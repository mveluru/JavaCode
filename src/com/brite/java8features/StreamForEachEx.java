package com.brite.java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * We Java developers will need to practice, and come up with an intuitive understanding of when to use Functional Programming, 
 * and when to stick with OO/imperative.With the right amount of practice, combining both will help us improve our software.
 * 
 */

public class StreamForEachEx {

	public void forEachMap() {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : "
					+ entry.getValue());
		}
		
		//java8
		System.out.println();
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

	}

	public void forEachList(){
		List<String> charList = new ArrayList<>();
		charList.add("A");
		charList.add("B");
		charList.add("C");
		charList.add("E");
		charList.add("F");
			
		charList.forEach(System.out::println);
		System.out.println("Loop Through");
		charList.forEach((i)->{System.out.println(i);});
		
		
	}
	public int recursion(int n){
		int y=0;
		if (n==1){
			return 1;
		}else{
			y= n*recursion(n-1);
		}
		return y;
	}
	
	public static void main(String a[]) {

		StreamForEachEx s = new StreamForEachEx();
		s.forEachMap();
		s.forEachList();
		System.out.println(s.recursion(5));

	}
}