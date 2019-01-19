package com.brite.pattern.singleton;

public class SingleTone02 {
	static SingleTone02 singletoneInstance;
	
	public static synchronized SingleTone02 getSingleToneInstance(){
		 if (singletoneInstance==null){
			 return singletoneInstance= new SingleTone02();
		 }else{
			 return singletoneInstance;
		 }
		
	}

}
