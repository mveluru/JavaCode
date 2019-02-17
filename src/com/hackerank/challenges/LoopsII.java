package com.hackerank.challenges;

import java.util.Scanner;

public class LoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int n = Integer.parseInt(in.next());
		if (b == 0) {
			in.close();
			System.out.print(a);
		} 
		if(n>0 ) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int powerofTwo = (int) Math.pow(2, i) * b;
				sum = sum + powerofTwo;
				System.out.print(" " + (a + sum));
			}
		}

		in.close();
	}

}
