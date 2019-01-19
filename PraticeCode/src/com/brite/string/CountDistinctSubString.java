package com.brite.string;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSubString {

	 public static int distinctSubstring(String str) {
		 
		 Set<String> result = new HashSet<>();
		 for(int i=0;i<str.length();i++){
			for (int j=i+1;j<str.length();j++){
				
				result.add(str.substring(i, j));
				System.out.print(" "+str.substring(i, j));
			}
		 }
		 
		return result.size();
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("\n"+distinctSubstring("abbc"));
	}
}
