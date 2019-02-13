package com.brite.pattern.singleton;

public class SingleTone03 {
	 static SingleTone03 singletone;
	
	 public static synchronized SingleTone03 getSingleInstance() {
		 if (singletone !=null) {
			 return singletone;
		 }else {
			 singletone =  new SingleTone03();
			 return singletone;
		 }
	 }

}
