package com.brite.amazon.datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsinTwoArrays {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>(); 
		
		  list1.add("Hii"); 
	        list1.add("Geeks"); 
	        list1.add("for"); 
	        list1.add("Geeks"); 
	        
	        list2.add("Hii"); 
	        list2.add("Geeks"); 
	        list2.add("Gaurav"); 
	        list1.retainAll(list2); 
	        System.out.println(list1);
	  
		
	}

}
