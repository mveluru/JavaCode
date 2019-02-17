package com.hackerank.challenges;

import java.util.Scanner;

public class PrimeNumber {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String n = scanner.nextLine();
		int num = Integer.parseInt(n);
		String isPrime = "prime";
		if (num > 0 && num != 1) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = "not prime";
				}
			}
		}

		scanner.close();
		System.out.println(isPrime);
	}

}
