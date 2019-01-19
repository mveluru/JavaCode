package com.brite.amazon;

public class AddAllNumbers {
	
	public void addOddandevenSeperatly(int[] a){
		int oddSum=0;
		int evenSum=a[0];
		for (int i=1;i<a.length;i++){
			if (i%2==0){
				evenSum +=a[i];
			}else{
				oddSum +=a[i];
			}
		}
		System.out.println("EvenSum:"+evenSum +" oddSum "+oddSum);
	}
public static void main(String[] args) {
	int[] a={4,5,6,7,3,2};
	AddAllNumbers add = new AddAllNumbers();
	add.addOddandevenSeperatly(a);
}
}
