package com.brite.amazon.datastructures.string;

public class FiboNumbers {
	
	public void fibo(int n){
		int[] a = null ;
		if (n <= Integer.MAX_VALUE){
		 a = new int[n];
		a[0]=0;
		a[1]=1;
			for (int i=2;i<a.length;i++){
				a[i]=a[i-1]+a[i-2];
			}
		}
		if(a!=null && a.length>0){
			for (int i=0;i<n;i++){
				System.out.print(" "+a[i]);
			}
		}else{
			System.out.println("Over flow");
		}
	}
public static void main(String[] args) {
	FiboNumbers fibo = new FiboNumbers();
	fibo.fibo(Integer.MAX_VALUE);
}	
}
