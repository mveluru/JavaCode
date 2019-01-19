package com.brite.amazon.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDistinctSubString {

	 public static int distinctSubstring(String str) {
		 
		 Set<String> result = new HashSet<>();
		 for(int i=0;i<str.length();i++){
			for (int j=i+1;j<str.length();j++){
				
				result.add(str.substring(i, j));
				System.out.print(" "+str.substring(i, j));
			}
		 }
		 
		return result.size();
	 }
	 public static void  listAllSubstrings(String str){
		//List<String> substrings = new ArrayList<String>();
		 for(int i=0;i<str.length();i++){
			 for (int j=i+1;j<str.length();j++){
				 String a =str.substring(i,j);
				 System.out.println(" "+ a +" "+a.length());
			 }
		 }
		
	 }
	 
	 
	 public static void main(String[] args) {
		// System.out.println("\n"+distinctSubstring("abbc"));
		 listAllSubstrings("abbc");
	}
}
