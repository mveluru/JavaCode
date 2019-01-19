package com.brite.systemdesign.consumer.producer;

import java.util.LinkedList;

public class PC02 {

	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;

	public void producer() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				if (list.size() == 2) {
					wait();
				}
				System.out.println("Producer  Produced " + value);
				list.add(value++);

				notify();
				Thread.sleep(1000);
			}

		}
	}

	public void consumer() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 0) {
					wait();
				}
				System.out.println("consumer consumed " + list.removeFirst());
				notify();
				Thread.sleep(1000);
			}
		}

	}
}
