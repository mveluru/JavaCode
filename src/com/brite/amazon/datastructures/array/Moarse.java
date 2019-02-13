package com.brite.amazon.datastructures.array;

import java.util.HashSet;
import java.util.Set;

public class Moarse {
	final String[] MORSE = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
			"--.." };

	public int uniqueMorseRepresentations(String[] words) {
		Set<String> seen = new HashSet();

		for (String word : words) {
			char[] charArray = word.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (char c : charArray)
			{	sb.append(MORSE[c - 'a']);
			System.out.println(MORSE[c]);}
			seen.add(sb.toString());
			System.out.println(sb.toString());
		}
		return seen.size();
	}
	

	

	public static void main(String[] args) {
		String[] words = new String[] { "gin", "zen", "gig", "msg" };
		Moarse seen = new Moarse();
		System.out.println(seen.uniqueMorseRepresentations(words));
	}
}
