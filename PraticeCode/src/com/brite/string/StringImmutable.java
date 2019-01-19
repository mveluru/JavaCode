package com.brite.string;

public class StringImmutable {

	
	public static void main(String[] args) {
		String s = "abc";
		String a = new String("abc");
		if (a==s){
			System.out.println("s==a");
		}else{
			System.out.println("s!=a");
			System.out.println(s.hashCode());
			System.out.println(a.hashCode());
		}
		
		if(a.equals(s)){
			System.out.println("a equals to s");
		}else{
			System.out.println("a NOT equals to s");
		}
	}

}
