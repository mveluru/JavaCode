package com.brite.pattern.singleton;

public class ChevyLTZModel_Singleton {
	static  ChevyLTZModel_Singleton  ChevyLTZModelInstance;
	String engineModel;
	private ChevyLTZModel_Singleton(){
		
		this.engineModel= "ChevyLTZv4MX";
	}
    static synchronized ChevyLTZModel_Singleton getChevryLTZInstance(){
    	if (ChevyLTZModelInstance == null){
    		return ChevyLTZModelInstance = new ChevyLTZModel_Singleton();
    	}else{
    		return ChevyLTZModelInstance;
    	}
    	
    	
    	
    	
    }
}
