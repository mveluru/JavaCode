package com.brite.amazon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCountAndConsonants {
	
	public void vowelCount(String input){
		String vowels ="[aeiouAEIOU]";
		
		Pattern p = Pattern.compile(vowels);
		Matcher m = p.matcher(input);
	    int count =0;
	    int length =input.length();
		while (m.find()){
			count++;
		}
		 
		System.out.println("Vowel Count "+count + " Consonant count"+ (length-count));
	}
public static void main(String[] args) {
	VowelCountAndConsonants vc = new VowelCountAndConsonants();
	vc.vowelCount("MurAli");
}
}
