package com.brite.amazon.datastructures.recursion;


public class IsUpperCaseFirstLetter {

	
	

	public char  checkFirstUpperCase(String s){
		
		if (s.length()>0){
			char atbeginchar = s.charAt(0);
			if (Character.isUpperCase(atbeginchar)){
				return atbeginchar;
			}else{
				return checkFirstUpperCase(s.substring(1, s.length()));
			}
		    
		}else{
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		IsUpperCaseFirstLetter uppercaseletter = new IsUpperCaseFirstLetter();
		System.out.println("Upper Case Letter "+uppercaseletter.checkFirstUpperCase("muralI"));
	}
}
