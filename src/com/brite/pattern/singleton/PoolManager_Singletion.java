package com.brite.pattern.singleton;


public class PoolManager_Singletion {
	static PoolManager_Singletion instance;
	
	private PoolManager_Singletion(){
		
	}
  public static synchronized PoolManager_Singletion getInstance(){
	  if(instance !=null){
		  return instance;
	  }else{
		  return new PoolManager_Singletion();
	  }
  }
}
