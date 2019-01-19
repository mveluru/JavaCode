package com.brite.amazon.recursion;

public class RecursionPrint1To100 {
	
	public void recursion(int i){
		if(i!=-1 && i<101){
			System.out.print(" "+i);
			recursion(++i);
		}
	}
	

	public static void main(String[] args) {
		RecursionPrint1To100 r = new RecursionPrint1To100();
		r.recursion(0);

	}

}
