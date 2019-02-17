package com.brite.java8features;

import java.util.Arrays;

public class RefactorMe {
	
	public void addLong(long[] longvalues){
	
     
		long sumOfLong = Arrays.stream(longvalues).sum();
	
		System.out.println(sumOfLong);
	
	}

	public static void main(String[] args) {
		long[] ll = {20,30,40,50,60,10};
		RefactorMe rfm = new RefactorMe();
		rfm.addLong(ll);
		
	}
}
