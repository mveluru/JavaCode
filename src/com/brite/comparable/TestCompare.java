package com.brite.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getAge()<o2.getAge()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(45,"Murali");
		Employee e2 = new Employee(40,"Murali10");
		Employee e3 = new Employee(39,"Murali9");
		Employee e4 = new Employee(38,"Murali8");
		Employee e5 = new Employee(37,"Murali7");
		Employee e6 = new Employee(36,"Murali6");
		Employee e7 = new Employee(35,"Murali5");
		Employee e8 = new Employee(34,"Murali4");
		
		TestCompare test = new TestCompare();
		List<Employee> elist = new ArrayList<>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		elist.add(e6);
		elist.add(e7);
		elist.add(e8);
		
		List<Employee> list = elist.stream().sorted(test).collect(Collectors.toList());
		for(Employee e:list) {
			System.out.println(e.getAge()+" "+e.getFullName());
		}
	}

}
