package com.brite.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.brite.java8features.model.Student1;

public class StudentSortList1 {
	
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(1, "Mahesh", 12));
		list.add(new Student1(2, "Suresh", 15));
		list.add(new Student1(3, "Nilesh", 10));
		
		System.out.println("---Natural Sorting by Name---");
		List<Student1> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		
		  System.out.println("---Natural Sorting by Name in reverse order---"); slist =
		  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		  slist.forEach(e -> System.out.println("Id:"+
		  e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		  
		  System.out.println("---Sorting using Comparator by Age---"); slist =
		  list.stream().sorted(Comparator.comparing(Student1::getAge)).collect(
		  Collectors.toList()); slist.forEach(e -> System.out.println("Id:"+
		  e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		  
		  System.out.println("---Sorting using Comparator by Age with reverse order---"
		  ); slist =
		  list.stream().sorted(Comparator.comparing(Student1::getAge).reversed()).
		  collect(Collectors.toList()); slist.forEach(e -> System.out.println("Id:"+
		  e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		 
	}

}
