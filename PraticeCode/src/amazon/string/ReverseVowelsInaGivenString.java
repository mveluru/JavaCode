package com.brite.amazon.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsInaGivenString {
	
	// Start two indexes from two corners 
    // and move toward each other 
	private char[] reverseVowels(String s){
		char[] schar = s.toCharArray();
		List<String> vowels = new ArrayList<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		
		int i = 0;
		int j = s.length()-1;
		while (i < j){
			if (!vowels.contains(schar[i])){
				i++;
				continue;
			}
			if (!vowels.contains(schar[j])){
				j--;
				continue;
			}
			
				char temp = schar[i];
				     schar[i]= schar[j];
				     schar[j]=temp;
			
		}
		return schar;
		
	}
	
public static void main(String[] args) {
	
	ReverseVowelsInaGivenString  rs = new ReverseVowelsInaGivenString();
	char[] ar = rs.reverseVowels("hello world");
	StringBuilder sb = new StringBuilder();
	for(char c: ar){
		sb.append(c);
	}
	System.out.println(sb.toString());
}	

}
