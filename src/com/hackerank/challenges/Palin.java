package com.hackerank.challenges;

import java.util.Scanner;

public class Palin {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] charArray = A.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i=charArray.length-1;i>=0;i--) {
        	sb.append(charArray[i]);
        	
        }
        if (A.equals(sb.toString())) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
		
	}

}
