package com.brite.java.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintMap {
	
	public static void main(String[] args) {
		
		  //https://www.mkyong.com/java/how-to-sort-a-map-in-java/
		  Map<String,Integer> map = new TreeMap<>( new Comparator<String>() {
		  
		  @Override
		  public int compare(String o1, String o2) 
		  { return o1.compareTo(o2);
		  }
		  
		  });
		 
		
		//or 
		
		//Map<String,Integer> map = new TreeMap<>(new MapValueComparator());
		
		map.put("Murali", 40);
		map.put("Aurali", 40);
		map.put("Burali", 41);
		map.put("Durali", 42);
		map.put("Zurali", 40);
		map.put("Eurali", 43);
		map.put("Furali", 40);
		map.put("Hurali", 42);
		map.put("Wurali", 41);
		map.put("Kurali", 39);
		map.put("Lurali", 41);
		
		//Print-1 on iteration		
		Iterator<String> entrykey = map.keySet().iterator();
		while (entrykey.hasNext()) {
			String key = entrykey.next();
			System.out.print("\n"+key +"  "+map.get(key));
		}
		
		
		System.out.println("\n");
		for(String key:map.keySet()) {
			System.out.println(key.toString()+" "+map.get(key));
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " value : "
					+ entry.getValue());
		}
		
		
		
		System.out.println("\n Java 8 Approach");
		map.forEach((k,v)->{System.out.println(k +" "+v);});
		
		//Value Sorting
		System.out.println("\nValue Sorting");
		
		  // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
        	System.out.println(" "+entry.getKey() +" "+entry.getValue());
            sortedMap.put(entry.getKey(), entry.getValue());
        }

		
		
	
	}

}
