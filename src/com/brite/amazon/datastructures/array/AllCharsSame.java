package com.brite.amazon.datastructures.array;

public class AllCharsSame {

	static boolean allCharsSameVerfication(String s) {
		boolean verfied = false;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == ch[0]) {
				verfied = true;
			} else {
				verfied = false;
			}
		}
		return verfied;
	}

	public static void main(String[] args) {

		String s = "aaab";
		if (allCharsSameVerfication(s))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
