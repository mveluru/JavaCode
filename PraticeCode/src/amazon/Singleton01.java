package com.brite.amazon;

public class Singleton01 {
	private static Singleton01 singletonInstance;
	
	static synchronized Singleton01 getSingletonInstance(){
		if (singletonInstance==null){
			singletonInstance = new Singleton01();
			return singletonInstance;
		}else{
			return singletonInstance;
		}
	}
public static void main(String[] args) {
	Singleton01 s1= getSingletonInstance();
	Singleton01 s2= getSingletonInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
