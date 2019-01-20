package com.brite.miscellaneous;

public class ConvertToBinary {
	public void binary(int num){
		String x="";
		
		while (num>0){
			int rem = num % 2;
			x =rem+x;
			num = num/2;
		}
		System.out.println(x +" "+Integer.parseInt(x));
	}
public static void main(String[] args) {
	ConvertToBinary cb = new ConvertToBinary();
	cb.binary(20);
}
}
