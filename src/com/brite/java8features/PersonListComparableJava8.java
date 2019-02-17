package com.brite.java8features;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.brite.java8features.model.Person;

public class PersonListComparableJava8 {
	public static void main(String[] args) {
		Person p1 = new Person("Veluru",LocalDate.now(),'M',"Hello@email.com");
		Person p2 = new Person("Murali",LocalDate.parse("2017-02-03"),'F',"Hello@email.com");
		Person p3 = new Person("Laxmi",LocalDate.parse("2010-02-03"),'M',"Hello@email.com");
		Person p4 = new Person("Aurali",LocalDate.parse("2008-02-03"),'F',"Hello@email.com");
		Person p5 = new Person("Baxmi",LocalDate.parse("2009-02-03"),'M',"Hello@email.com");
		List<Person> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		List<Person> pslist = plist.stream().sorted().collect(Collectors.toList());
		pslist.forEach(o->{System.out.println(o.getName() +" "+o.getGender());});
		
	}
		
	
	

}
