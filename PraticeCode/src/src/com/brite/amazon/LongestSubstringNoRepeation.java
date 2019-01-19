package com.brite.amazon;

import java.util.Arrays;

public class LongestSubstringNoRepeation {

	public int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int longLen = 0;
		if (!s.equals(" ")&&length > 1) {

			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j <= length; j++) {

					if (!checkCharRepetition(s.substring(i, j))) {
						if (longLen < s.substring(i, j).length()) {
							longLen = s.substring(i, j).length();
						}

					}
				}
			}
		}else if(length == 1){
			longLen=1;
		}else if(s.equals(" ")){
			longLen=1;
		}
		return longLen;
	}

	private boolean checkCharRepetition(String s) {
		boolean dups = false;
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				dups = true;
			}
		}
		return dups;
	}

	public static void main(String[] args) {
		LongestSubstringNoRepeation lss = new LongestSubstringNoRepeation();
		System.out.println(lss.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX"));;
	}
}
