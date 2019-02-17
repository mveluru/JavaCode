package com.brite.exceptions;

import java.io.IOException;

public class ChildClass extends ParentClass{
	
	
	public void test () {
		System.out.println("childTest");
		
	}
	
	public void test1() throws IOException {
		System.out.println("childTest1");
	}

}
