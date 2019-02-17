package com.hackerank.challenges;

import java.util.Arrays;

public class Anagram {
	
	static boolean isAnagram(String a, String b) {
		boolean isAnagram = false;
		char[] aarray = a.toCharArray();
		char[] barray = b.toCharArray();
		Arrays.sort(aarray);
		Arrays.sort(barray);
		if (aarray.length==barray.length) {
			for(int i=0;i<aarray.length;i++) {
				if (aarray[i]==barray[i]) {
					isAnagram=true;
				}else {
					isAnagram=false;
				}
			}
		}
		return isAnagram;
	}
	
	public static void main(String[] args) {
		boolean ret = isAnagram("anagram","margana");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}

}
