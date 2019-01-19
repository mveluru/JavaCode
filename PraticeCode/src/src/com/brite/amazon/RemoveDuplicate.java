package com.brite.amazon;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	
	// remove duplicates from a string
	
	public void removeDuplicate(String s){
		List<String> noDups = new ArrayList<>();
		String[] sw = s.split("//s");
		for (String ss:sw){
			if (!noDups.contains(ss)){
				noDups.add(ss);
			}
		}
		System.out.println(noDups);
	}
public static void main(String[] args){
	RemoveDuplicate rd = new RemoveDuplicate();
	rd.removeDuplicate("Murali Murali Sujana Sujana");
}
}
