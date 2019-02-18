package com.brite.amazon.datastructures.string;

import java.util.ArrayList;
import java.util.List;

public class Pangram {

	public static void main(String[] args) {
		String input = "welcome to geeksforgeeks";
		char[] stringtoChar = input.toCharArray();
		List<Character> chrs = new ArrayList<>();
		List<Character> stringtoCharlist = new ArrayList<>();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			chrs.add(ch);
		}

		for (int i = 0; i < stringtoChar.length; i++) {
			if (stringtoChar[i] != ' ') {
				stringtoCharlist.add(stringtoChar[i]);
			}
		}

		/*
		 * for (char ch = 'A'; ch <= 'Z'; ch++) { chrs.add(ch); }
		 */

		for (char c : chrs) {
			if (!stringtoCharlist.contains(c)) {
				System.out.print(c);
			}
		}
	}

}
