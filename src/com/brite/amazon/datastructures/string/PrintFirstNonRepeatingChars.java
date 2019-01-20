package com.brite.amazon.datastructures.string;

import java.util.ArrayList;
import java.util.List;
//not working
public class PrintFirstNonRepeatingChars {

	public void nonRepeatingChar(String s) {
		List<Character> chars = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (!chars.contains(s.charAt(i))) {
				chars.add(s.charAt(i));
			} else {
				//chars.remove(s.charAt(i));
			}
		}
		System.out.println(chars.get(0));
	}

	public static void main(String[] args) {
		PrintFirstNonRepeatingChars pf = new PrintFirstNonRepeatingChars();
		pf.nonRepeatingChar("LLILLY");

	}
}
