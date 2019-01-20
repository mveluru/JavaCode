package com.brite.amazon.datastructures.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlycharsInstring {

	public boolean chars(String s) {
		String digits = "[^0123456789]";
		String aplpha = "[abcdefghijklmnopqrstuvwxyz]";
		Pattern p = Pattern.compile(digits);
		Matcher m = p.matcher(s);
		int count = 0;
		while (m.find()) {
			count++;
		}
		if (count == s.length()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] s) {
		OnlycharsInstring os = new OnlycharsInstring();
		System.out.println(" Characters found " + os.chars("HELL1MURALI"));
		System.out.println(" Characters found " + os.chars("HELLOMURALI"));
		System.out.println(" Characters found " + os.chars("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1"));
	}

}
