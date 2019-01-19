package com.brite.amazon.datastructures.array;

public class Bits {
	public static void main(String args[]) 
    { 
        int a = 10; 
        int b = 5;
  
        // Convert integer number to binary  format 
        System.out.println(Integer.toBinaryString(a)); 
        System.out.println(Integer.toBinaryString(b)); 
        a=a^b^(b=a);
        System.out.println(a +" "+b);; 
  
        // to print number of 1's in the number a 
        System.out.println(Integer.bitCount(a)); 
    } 

}
