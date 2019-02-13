package com.brite.amazon.datastructures.string;

import java.util.Scanner;

public class ToLower {
   static Scanner scanner = new Scanner(System.in);
   
   private String toLowerCase(String str) {
	   return str.toLowerCase();
   }
	
	public static void main(String[] args) {
		ToLower tolower = new ToLower();
		
		String str = tolower.toLowerCase(scanner.next());
		
		
	}
}
