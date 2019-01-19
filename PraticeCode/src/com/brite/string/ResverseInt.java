package com.brite.string;

public class ResverseInt {

public int reverseInt(int inptutNum){
	int resverseNum = 0;
	
	while(inptutNum !=0){
		resverseNum= resverseNum*10+ inptutNum%10;
		inptutNum=inptutNum/10;
	}
	
	return resverseNum;
	
}

public static void main(String[] args) {
	ResverseInt ri = new ResverseInt();
	System.out.println("reverse int "+ ri.reverseInt(0));
}
}
