package com.brite.java8features;

import com.brite.java8features.Interface.FuncationInterface;
import com.brite.java8features.Interface.FunctionalInterfaceArgs;

public class FuncationInterfaceImpl {
	public static void main(String[] args) {
		FuncationInterface obj = ()->System.out.println("Murali");
		obj.doSomething();
		
		FunctionalInterfaceArgs ObjArg =(a1,a2)->{
			 System.out.println(a1 + " "+a2);
		};
		
		ObjArg.doSomething(44, "Murali");
	}

}
