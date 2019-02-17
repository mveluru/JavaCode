package com.hackerank.challenges;

import java.util.Scanner;

public class DigitPalin {
	static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int input = scan.nextInt();
		int tempint=0;
		if(input>9) {
			while(input>0) {
				tempint = (tempint*10)+ input%10;
			input = input/10;
			}
			
		}
		System.out.println(tempint);
	}

}
