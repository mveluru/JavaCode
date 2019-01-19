package com.brite.amazon.recursion;

public class StringRecursiveReversal {
	int reversed = 0;

	private String reverseString(String s) {
		String reversed;

		if (s.equals("") || s.length() == 1) {
			return reversed = s;
		} else {
			reversed = s.charAt(s.length() - 1)
					+ reverseString(s.substring(0, s.length() - 1));

		}
		return reversed;
	}

	private int reverseInteger(int i) {

		if (i != 0) {
			reversed = (reversed * 10) + (i % 10);
			reverseInteger(i / 10);
		}
		return reversed;
	}

	private int integerReversed(int i) {
		int reversed = 0;

		while (i != 0) {
			reversed = (reversed * 10) + (i % 10);

			i = i / 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		StringRecursiveReversal sr = new StringRecursiveReversal();
		System.out.println(sr.reverseString("ABCDEF"));
		System.out.println(sr.reverseInteger(123));
		System.out.println(sr.integerReversed(Integer.MAX_VALUE));
		System.out.println(sr.integerReversed(2147483646));
		System.out.println(sr.integerReversed(123));
	}
}
