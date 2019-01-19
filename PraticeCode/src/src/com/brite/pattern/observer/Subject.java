package com.brite.pattern.observer;

import java.util.ArrayList;

public abstract class Subject {
	
	 protected ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	public void registerObserver(IObserver observer){
		if (!observers.contains(observer)){
		  observers.add(observer);
		}else{
			System.out.println("cannot add ");
		}
	}

    public void removeObserver(IObserver observer){
    	if (!observers.isEmpty()&& observers.contains(observer)){
    	 observers.remove(observer);
    	}
    	
    }

    public abstract void notifyObservers();

}
