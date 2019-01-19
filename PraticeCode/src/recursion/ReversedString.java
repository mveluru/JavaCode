package com.brite.amazon.recursion;

public class ReversedString {
	
	//using recursion
	 public static String reverseString(String str){
		   
	      if(str.isEmpty()){
	    	 
	         return str;
	      } else {
	    	 //System.out.println(str.substring(1)+" " +str.charAt(0)); 
	    	 
	         return reverseString(str.substring(1))+str.charAt(0);
	      }
	     
	   }
	
	public static void main(String[] args) {
		
		String str ="abbc";
		StringBuffer sb = new StringBuffer();
		 for (int i=str.length()-1;i>=0;i--){
			 sb.append(str.charAt(i)) ;
		 }
		 System.out.println("reversed string "+sb.toString());
		 System.out.println(System.currentTimeMillis());
		 System.out.println(reverseString("abbcvbvcxcvbnxcvfgterfgtyhujikwsdecvfrghtyujkloikabbcvbvcxcvbnxcvfgterfgtyhujikwsdecvfrghtyujkloik"));
		 System.out.println(System.currentTimeMillis());
	}
	

}
