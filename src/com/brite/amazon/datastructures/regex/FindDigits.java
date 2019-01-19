package com.brite.amazon.datastructures.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class FindDigits {
	
	public void findDigits(String input){
	   String digits ="[0123456789]";
	   Pattern p = Pattern.compile(digits);
	   Matcher m = p.matcher(input);
	   StringBuffer sb = new StringBuffer();
	   while (m.find()){
		  m.appendReplacement(sb, "");
	   }
	   System.out.println(sb.toString());
	   System.out.println(input);
	}
public static void main(String[] args) {
	FindDigits fd = new FindDigits();
	fd.findDigits("MURALI123456");
}
}
