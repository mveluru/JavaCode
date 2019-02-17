package com.hackerank.challenges;

import java.util.Scanner;

public class LexioString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();
		sc.close();
		int lenofString = A.length() + B.length();
		A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
		B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
		System.out.println(lenofString);
		int lexvalue = A.compareTo(B);
		if (lexvalue <= 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		System.out.println(A + " " + B);

	}

}
