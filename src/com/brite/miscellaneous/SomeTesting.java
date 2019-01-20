package com.brite.miscellaneous;

public class SomeTesting {
	int i;
	double d ;
	float  f;
	byte b;
	
	public void testMethod(){
		System.out.println("Integer: " +i);
		System.out.println("double: " +d);
		System.out.println("Float: " +f);
		System.out.println("Integer: " +Integer.MAX_VALUE +" "+Integer.MIN_VALUE);
		System.out.println("double: " +Double.MAX_VALUE +" "+Double.MIN_VALUE);
		System.out.println("Float: " +Float.MAX_VALUE+" "+Float.MIN_VALUE);
		
		double k = Integer.MAX_VALUE ;
		System.out.println(" K: "+k);
		float kf = Integer.MAX_VALUE ;
		System.out.println(" Kf: "+kf);
		k=kf;
		
		System.out.println(" K: "+k);
		kf=(float) k;
		System.out.println(" K: "+kf);
	System.out.println("BYTE " + Byte.MAX_VALUE +" "+Byte.MIN_VALUE);
	 i=200;
	 b=(byte) i;
		System.out.println(b); // Some Garbage value
		b = (byte) 400;
		i=b;
		System.out.println(i);
	}
	
public static void main(String args[]){
	SomeTesting testing = new SomeTesting();
	testing.testMethod();	
}


}
