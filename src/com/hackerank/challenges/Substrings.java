package com.hackerank.challenges;

import java.util.Scanner;

public class Substrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S= in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		in.close();
		if (S.length()>=1 && S.length()<=100) {
			if (0<=start && start<end) {
				System.out.println(S.substring(start, end));
			}
			
		}
		
		
	}

}
