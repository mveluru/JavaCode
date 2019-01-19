package com.brite.datastructures;

import com.brite.model.Employee;

public class EmployeeLinkedListMain {

	public static void main(String[] args) {
		Employee Murali = new Employee("Muralidhar", "Veluru", 100);
		Employee Sujana = new Employee("Sujana", "Nallavadla", 101);
		Employee Ritvik = new Employee("Ritvik", "Veluru", 102);
		Employee Rikita = new Employee("Rikita", "Veluru", 103);
		
		LinkedList list = new LinkedList();
		list.addToFront(Murali);
		list.addToFront(Sujana);
		list.addToFront(Ritvik);
		list.addToFront(Rikita);
       
		list.printList();
	}

}
