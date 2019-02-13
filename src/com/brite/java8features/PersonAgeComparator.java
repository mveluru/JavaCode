package com.brite.java8features;

import java.util.Comparator;

import com.brite.java8features.model.Person;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getBirthday().compareTo(o2.getBirthday());
	}

}
