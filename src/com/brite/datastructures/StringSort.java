package com.brite.datastructures;

import java.util.Arrays;

public class StringSort {
	 public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
	    } 

	 public static void main(String[] args) 
	    { 
	        String inputString = "hello"; 
	        String str = sortString(inputString); 
	          
	        
	        
	        int len = str.length(); 
	        int count[] = new int[256]; 
	  
	        // Initialize count array index 
	        for (int i = 0; i < len; i++) 
	            count[str.charAt(i)]++; 
	  
	        // Create an array of given String size 
	        char ch[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
	            ch[i] = str.charAt(i); 
	            int find = 0; 
	            for (int j = 0; j <= i; j++) { 
	  
	                // If any matches found 
	                if (str.charAt(i) == ch[j])  
	                    find++;                 
	            } 
	  
	            if (find == 1)  
	                System.out.print(
	                 str.charAt(i) + "" + count[str.charAt(i)]);             
	        } 
	    } 
}
