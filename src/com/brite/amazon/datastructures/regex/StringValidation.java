package com.brite.amazon.datastructures.regex;

public class StringValidation {
	
	public void  validation(String[] string) {
		
		for (String str:string) {
			
		 
		 

			if (str.length()>=6 && str.matches("^[0-9].*$") ) {
				//System.out.println("starts with a number " + str);
			}else if (str.length()>=6 && str.matches("^[_].*$") ) {
				//System.out.println(" starts with under_ " + str);
			}else if (str.length()>=6 && str.matches("\\s")){
				//System.out.println(" starts with number or under " + str);
			}else {
				System.out.println(" does starts with number or under " + str);
			}
			
		
		}
		
		
		//&& str.matches("[_].*$") && str.matches("^[\\s]")
		
	}
	
	public static void main(String[] arg) {
		StringValidation strvalid = new StringValidation();
		
		String[] strValues = {
	            "Hello World",
	            "123Hello World",
	            "9 Carlton Avenue",
	            "p1ssw0rd",
	            "_p1ssw0rd"
	        };
		
		strvalid.validation(strValues);
		
	}
   
	
	
}
