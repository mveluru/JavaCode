package com.brite.java8features;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		if(o1.equals(o2)) {
			return 0;
		}else  {
			return 1;
		}
		
		
		
	}

}
