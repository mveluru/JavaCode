package com.brite.amazon;

public class PassbyValue {
	public void change (int x){
		x=x+5;
		System.out.println(x);
	}
	public void changeX (int x){
		x=x+10;
		System.out.println(x);
	}
public static void main(String[] args) {
	int x =5;
	 PassbyValue p = new PassbyValue();
	 p.change(x);
	 p.changeX(x);
	 System.out.println(x);
}
}
