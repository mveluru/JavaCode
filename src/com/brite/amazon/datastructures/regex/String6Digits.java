package com.brite.amazon.datastructures.regex;

import java.util.Scanner;

public class String6Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while (sc.hasNext()&& count<3) {
			System.out.println(sc.nextInt());
			count++;
		}

	}

}
