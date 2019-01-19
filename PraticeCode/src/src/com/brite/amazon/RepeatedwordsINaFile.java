package com.brite.amazon;

import java.util.HashMap;
import java.util.Map;

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
	}
	
public static void main(String[] args) {
	RepeatedwordsINaFile r = new RepeatedwordsINaFile();
	r.ReadStringCount("MURALI Murali MURALI");
}

}
