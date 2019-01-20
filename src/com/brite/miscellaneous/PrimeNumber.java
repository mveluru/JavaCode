package com.brite.miscellaneous;

public class PrimeNumber {
	
	public static void main(String[]args){
		boolean isPrime = true;
		//int givenNumber = Integer.MAX_VALUE; // it's prime
		//int givenNumber = Integer.MIN_VALUE;// garbage results
		int givenNumber = -3;// garbage results
		if (givenNumber == 0 || givenNumber==1){
			System.out.println("Not a prime Number");
		}else{
			for (int i=2;i<=givenNumber/2;i++){
				if (givenNumber%i ==0){
					System.out.println("Given Number "+givenNumber+" is Not a prime Number");
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime){
			System.out.println(" Given Number "+ givenNumber +"  is prime ");
		}
	}
	

}
