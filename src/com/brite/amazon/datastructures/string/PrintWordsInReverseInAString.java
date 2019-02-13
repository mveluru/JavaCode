package com.brite.amazon.datastructures.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class PrintWordsInReverseInAString {

	public static void printReverseWord(String stringOfWords) {
		String[] stringArray = stringOfWords.split(" ");
		String[] revArray = new String[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			revArray[stringArray.length - i - 1] = stringArray[i];
		}
		for (String s : revArray) {
			System.out.print(" " + s);
		}
	}

	public static void printrevwords(String stringofWords) {
		StringTokenizer string = new StringTokenizer(stringofWords);
		
		List<String> StringCount = new ArrayList<>();
		
		
		while (string.hasMoreTokens()) {
			StringCount.add(string.nextToken());
			
		}
		
		Set<String>  treeSet = new TreeSet<>();
		StringTokenizer strings = new StringTokenizer(stringofWords);
		while (strings.hasMoreTokens()) {
			
			treeSet.add(strings.nextToken());
		}
		
		System.out.println("\n String Count "+StringCount.size());
		System.out.println("\n String no dupsCount "+treeSet.size());
		
		int count =(int) StringCount.stream().sorted().distinct().count();
		System.out.println("word count "+ count);
		
	}

	public static void main(String[] args) {
		String s = "Murali Sujana Ritvik Rikita Murali Sujana Ritvik Rikita Murali Sujana Ritvik Rikita Murali Sujana Ritvik Rikita";
		printReverseWord(s);
		printrevwords(s);
	}
}
