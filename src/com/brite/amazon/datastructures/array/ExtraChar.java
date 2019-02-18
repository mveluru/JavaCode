package com.brite.amazon.datastructures.array;

import java.util.Arrays;

public class ExtraChar {
	
	public static void  findextrachar(String s,String s1) {
		char[] s1chars = s.toCharArray();
		Arrays.sort(s1chars);
		char[] s2chars = s1.toCharArray();
		Arrays.sort(s2chars);
		int s1charslen = s1chars.length-1;
		int s2charslen = s2chars.length-1;
		
		if (s1charslen>s2charslen) {
			System.out.println(s1chars[s1charslen]);
		}else {
			System.out.println(s2chars[s2charslen]);
		}
	}

	public static void main(String[] args) {
		String strA= "abcd";
		String strB = "cbdae";
		findextrachar(strA,strB);
	}
}
