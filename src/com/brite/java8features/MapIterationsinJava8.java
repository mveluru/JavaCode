package com.brite.java8features;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class MapIterationsinJava8 {
	// Program to print all keys present in the Map using keySet() in Java
		public static void main (String[] args)
		{
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "Murali");
			map.put(2, "Veluru");

			// 1. using Iterator Java 7
			Iterator<Integer> itr = map.keySet().iterator();
			while (itr.hasNext()) {
				Integer key = itr.next();
				System.out.println(key + " "+map.get(key));
			}

			// 2. For-each Loop
			for (Integer key : map.keySet()) {
				System.out.println(key);
			}

			// 3. Java 8 - Collection.iterator() + Iterator.forEachRemaining()
			map.keySet().iterator()
					.forEachRemaining(System.out::println);

			// 4. Java 8 - Collection.stream() + Stream.forEach()
			map.keySet().stream()
					.forEach(System.out::println);

			// Java 8 - Stream.of() + Collection.toArray() + Stream.forEach()
			Stream.of(map.keySet().toArray())
					.forEach(System.out::println);

			// 5. Convert to String
			System.out.println(map.keySet().toString());

			// Java 8
			Stream.of(map.keySet().toString())
					.forEach(System.out::println);
		}

}
