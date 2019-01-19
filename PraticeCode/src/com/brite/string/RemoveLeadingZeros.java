package com.brite.string;
/*
 * Remove Leading Zeros From String in Java
 */
public class RemoveLeadingZeros {

	private void removeleadZero(String input){
		String inputstring = input;
		char[] carray = inputstring.toCharArray();
		int  inputlen = inputstring.length();
		
			if(carray[0] == '0'){
				String s =input.substring(1, inputlen);
				
				removeleadZero(s);
			}else {
				System.out.println(inputstring); 
			}
		
	}
	
	public static void main(String[] args) {
		RemoveLeadingZeros removeleadzeros = new RemoveLeadingZeros();
		removeleadzeros.removeleadZero("00000123569");
		removeleadzeros.removeleadZero("000012356090");
	
	}
}
