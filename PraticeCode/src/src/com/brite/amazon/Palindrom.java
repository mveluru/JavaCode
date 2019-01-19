package com.brite.amazon;

public class Palindrom {

	public boolean isPalindrome(String in) {
		
		if (in.equals("") || in.length() < 2) 
			return true;
		
			if (in.charAt(0) == in.charAt(in.length() - 1))
			return	isPalindrome(in.substring(1, in.length() - 1));
		

		return false;
		
	}
	

	public boolean isPalindrome01(String s) {
		char[] StringToChars = s.toCharArray();
		int length = StringToChars.length;
		StringBuffer sb = new StringBuffer();
		for (int i = length-1; i>= 0; i--) {
			sb.append(StringToChars[i]);
		}

		return s.equals(sb.toString());

	}
public boolean isPalindrom02(String s){
	
	char[] c = s.toCharArray();
	StringBuffer sb = new StringBuffer();
	 for(int i=c.length-1;i>=0;i--){
		 sb.append(c[i]);
	 }
	return s.equals(sb.toString());
}
	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		System.out.println(p.isPalindrome("level"));
		System.out.println(p.isPalindrome01("level"));
		System.out.println(p.isPalindrom02("level"));
	}
}
