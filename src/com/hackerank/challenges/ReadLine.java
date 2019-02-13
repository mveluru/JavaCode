package com.hackerank.challenges;

import java.util.Scanner;

public class ReadLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (scanner.hasNext()) {
			System.out.println(++count + " " + scanner.nextLine());
		}
		scanner.close();

	}

}
