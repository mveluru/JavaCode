package com.brite.amazon.datastructures.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

	public static int count(String word) {

		if (word == null || word.isEmpty()) {
			return 0;
		}

		int wordCount = 0;
		boolean isWord = false;
		int endOfLine = word.length() - 1;
		char[] characters = word.toCharArray();
		for (int i = 0; i < characters.length; i++) {

			if (Character.isLetter(characters[i]) && i != endOfLine) {
				isWord = true;
			} else if (!Character.isLetter(characters[i]) && isWord) {
				wordCount++;
				isWord = false;

			} else if (Character.isLetter(characters[i]) && i == endOfLine) {
				wordCount++;
			}

		}

		return wordCount;

	}

	public static void main(String[] args) {
		String inputString = " Today is Sunny day around 80C ";
		String digits = "[\\s]";
		Pattern p = Pattern.compile(digits);
		String string = inputString.trim();
		Matcher m = p.matcher(string);
		int count = 0;
		while (m.find()) {
			count++;
		}
		System.out.println(count+1);
	}

}
