package com.brite.amazon.datastructures.string;

public class StringAandStringB {
	String A ="a";
	String B="b";
	String c=null;
	String d = null;
	
	public void prints(int aA, int bB) {
		StringBuffer sb1 = new StringBuffer();
		
	
		if ((aA) >= 0 && (aA) <= 100) {
			
			for (int i = 0; i < aA; i++) {
				sb1.append(A);
			}
		}
		
		if ((bB) >= 0 && (bB) <= 100) {
			
			for (int i = 0; i < bB; i++) {
				sb1.append(B);
			}
		}
		System.out.println(sb1.toString());
		
	}

	public static void main(String[] args) {
		StringAandStringB aabb = new StringAandStringB();
		aabb.prints(4, 2);;
	
	}

}
