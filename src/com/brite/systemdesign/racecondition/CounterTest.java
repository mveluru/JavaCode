package com.brite.systemdesign.racecondition;
/**
 * 
 * @author Muralidhar.veluru
 * Finally, just for fun; add synchronized to the increment method of MyCounter and then rerun. 
 * The race condition will disappear, and now the program will correctly print 2000000. 
 * This is because every call to increment will now only allow one thread in to the shared method at a time. 
 * Thus serializing each access to the shared variable c, and putting an end to the race.
 * 
 *
 */
public class CounterTest {    
    public static void main(String[] args) throws InterruptedException {   
        MyCounter counter = new MyCounter();

        Thread thread1 = new Thread(new CounterIncRunnable(counter));
        thread1.setName("add thread");
        thread1.start();

        Thread thread2 = new Thread(new CounterIncRunnable(counter));
        thread2.setName("add thread2");
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.value());
    }    
}