package com.brite.pattern.singleton;
/*
 * Lazy Singleton
 * Eagerly Singleton;
 */
public class Test_Singleton {
	ChevyLTZModel_Singleton chevy0;
	ChevyLTZModel_Singleton chevy1;
	
	Test_Singleton(){
		chevy0 = ChevyLTZModel_Singleton.getChevryLTZInstance();
		chevy1 = ChevyLTZModel_Singleton.getChevryLTZInstance();
	}
	
	public void printAddress(){
		System.out.println(chevy1.hashCode());
		System.out.println(chevy0.hashCode());
	}
	public static void main(String[] args) {
		Test_Singleton ts = new Test_Singleton();
		ts.printAddress();
	}
}
