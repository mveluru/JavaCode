package com.brite.amazon.datastructures.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class RepeatedwordsINaFile {
	
	
	public void ReadStringCount(String s){
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String[] strings = s.split("\\s");
			
	    for(String ss:strings){
	    	String lowercaseString = ss.toLowerCase();
	    	if (!wordMap.containsKey(lowercaseString)){
				wordMap.put(lowercaseString, 1);
			}else if(wordMap.containsKey(lowercaseString)){
				
				wordMap.put(lowercaseString, wordMap.get(lowercaseString)+1);
			}
	    }
		
		
		wordMap.forEach((k,v)->System.out.println("words:"+k +" count "+v));
		
		//iterator java 7
		Iterator<String> iterator = wordMap.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key "+key+" "+ wordMap.get(key));
			
		}
		
		wordMap.keySet().stream().forEach(System.out::println);
		
		Stream.of(wordMap.keySet().toArray())
		.forEach(System.out::println);
		
	}
	
	
	
public static void main(String[] args) {
	RepeatedwordsINaFile r = new RepeatedwordsINaFile();
	r.ReadStringCount("MURALI Murali MURALI");
}

}
