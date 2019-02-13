package com.brite.amazon.datastructures.string;

import java.util.Hashtable;
import java.util.Map;

//not work
public class PrintFirstNonRepeatingChars {

	public void nonRepeatingChar(String s) {
		Map<Character, Integer> charCount = new Hashtable<>();
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (!charCount.containsKey(key)) {
				charCount.put(key, 1);
			} else {
				int count = charCount.get(key);
				charCount.put(key, ++count);

			}
		}

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (1 == charCount.get(chars[i])) {
				System.out.println(chars[i]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		PrintFirstNonRepeatingChars pf = new PrintFirstNonRepeatingChars();
		pf.nonRepeatingChar("MMMMBMMMADMMMM");

	}
}
