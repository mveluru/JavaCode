package com.brite.amazon.recursion;

public class SumOfFirstN {
	int sum =0;
	public int Sum(int number){
		if(number !=0 && number >0){
			sum = sum + number;			
			Sum(--number);
			//Sum(number--) Stack over flow
		}
		
		return sum;
		
    
       
	}
public static void main(String[] args) {
	SumOfFirstN sum = new SumOfFirstN();
	//System.out.println(sum.Sum(100)); Good Result
	//System.out.println("Fails "+ sum.Sum(Integer.MAX_VALUE)); //java.lang.StackOverflowError
	System.out.println("Pass "+ sum.Sum(Integer.MIN_VALUE)); // Sum 0
	System.out.println("No compliation error but fails logically "+ sum.Sum(Integer.MAX_VALUE+1));// Sum 0
}
}
