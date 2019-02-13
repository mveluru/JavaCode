package com.brite.amazon.datastructures.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexoNext3Chars {
	
	public static void main(String[] args) {
		 String digits ="[java]";
		 String input = "welcomejava";
		   Pattern p = Pattern.compile(digits);
		   Matcher m = p.matcher(input);
		   StringBuffer sb = new StringBuffer();
		   while (m.find()){
			  m.appendReplacement(sb, "");
		   }
		   System.out.println(sb.toString());
		   System.out.println(input);
	}

}
