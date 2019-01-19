package com.brite.systemdesign.racecondition;

class MyCounter {
    private volatile int c = 0;

    public  void increment() {
    	synchronized (this) 
        {
    		c++;
        }
    }

    public   void decrement() {
        c--;
    }

    public  int value() {
        return c;
    }    
}
