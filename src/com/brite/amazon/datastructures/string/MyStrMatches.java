package com.brite.amazon.datastructures.string;

public class MyStrMatches {

	public static void main(String[] args) {
		String[] str = {"http://java2novice.com", "www.java2novice.com"};
        for(int i=0;i < str.length;i++){
            if(str[i].matches("^www\\.(.+)")){
                System.out.println(str[i]+" Starts with 'www'");
            } else {
                System.out.println(str[i]+" is not starts with 'www'");
            }
        }
	}

}
