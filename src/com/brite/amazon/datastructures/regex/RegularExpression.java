package com.brite.amazon.datastructures.regex;

import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9$]*");
		String gottenData = "Joe$Schmoe002";
		String[] match =gottenData.split("\\$");
		if(match.length==1){
			System.out.println(false);
			
		}else{
			if (p.matcher(gottenData).matches()){
			    System.out.println("true");
				}else{
					System.out.println("false");
				}
		}
		
		
	}

}
