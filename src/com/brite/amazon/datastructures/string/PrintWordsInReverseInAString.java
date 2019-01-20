package com.brite.amazon.datastructures.string;

public class PrintWordsInReverseInAString {
	
 public static void printReverseWord(String stringOfWords){
	 String[] stringArray = stringOfWords.split(" ");
	 String[] revArray = new String[stringArray.length];
	 for(int i=0;i<stringArray.length;i++){
		 revArray[stringArray.length-i-1]=stringArray[i];
	 }
	 for(String s:revArray){
		 System.out.print(" "+s);
	 }
 }
public static void main(String[] args) {
	String s = "Murali Sujana Ritvik Rikita Murali Sujana Ritvik Rikita Murali Sujana Ritvik Rikita Murali Sujana Ritvik Rikita";
	printReverseWord(s);
}
}
