package com.brite.java8features;

import java.util.Comparator;

import com.brite.java8features.model.Player;

public class PlayerCompartor implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		int compareName = o1.getName().compareTo(o2.getName());
		
		int compareScore = o1.getScore().compareTo(o2.getScore());
		
		if (compareName>=0) {
			return compareScore;
		}else {
			return compareName;
		}
		
		
	}

}
