package com.brite.amazon.datastructures.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
	
	public void dupchar(String input){
		Map<Character,Integer> dupCharCount = new HashMap<>();
		for(int i=0;i<input.length();i++){
			Character key = Character.toUpperCase(input.charAt(i));
			if(dupCharCount.containsKey(key)){
				int count =dupCharCount.get(key);
				dupCharCount.put(key,++count);
			}else{
				dupCharCount.put(key,1);
			}
		}
		dupCharCount.forEach((k,v)->{System.out.println("char "+k +" Count "+v);});
	}
public static void main(String[] args) {
	DuplicateChars dups = new DuplicateChars();
	dups.dupchar("ABCDeFABCDEFABCDeFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEFABCDEF");
}
}
