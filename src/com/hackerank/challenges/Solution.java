package com.hackerank.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	
	String inputvalues;
	
	public Solution(String input){
		this.inputvalues =input;
	}
	
	private void testException()throws Exception {
		
	
		String[] s = inputvalues.split("\\s+");
		Pattern p = Pattern.compile("[A-Za-z)]");
		Matcher m = p.matcher(s[0]);
		boolean s0 = m.find();
		boolean s1 = p.matcher(s[1]).find();
		try{
		int i = Integer.parseInt(s[0]);
		int j = Integer.parseInt(s[1]);
		
		if ((s0 && s1)||(s0 && !s1)||(!s0 && s1)) {
			throw new java.util.InputMismatchException();
		}else if(Integer.parseInt(s[1])==0){
			throw new java.lang.ArithmeticException();
		}else{
			System.out.println(i/j);
		}
		}catch(java.lang.NumberFormatException e){
			System.out.println("java.util.InputMismatchException");
		}catch (java.util.InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		}catch (java.lang.ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: / by zero");
		}

	}

	public static void main(String[] args) throws Exception {
		 BufferedReader input =  
                 new BufferedReader(new InputStreamReader(System.in)); 
		new Solution(input.readLine()).testException();;


	}

}
