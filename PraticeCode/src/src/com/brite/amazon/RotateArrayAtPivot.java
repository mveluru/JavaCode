package com.brite.amazon;

//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
public class RotateArrayAtPivot {

	public void rotate(int[] array){
		int lowerIndex = 0;
		int higherIndex = array.length-1;
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		int mid = lowerIndex+(higherIndex-lowerIndex)/2;
		int lowMid=mid;
		while(lowerIndex<=lowMid){
			array[lowerIndex] = array[lowerIndex]^array[lowMid]^(array[lowMid]=array[lowerIndex]);
			lowerIndex++;
			lowMid--;
			
		}
		int MidPlusone=mid+1;
		while(MidPlusone <higherIndex){
			array[MidPlusone] = array[MidPlusone]^array[higherIndex]^(array[higherIndex]=array[MidPlusone]);
			MidPlusone++;
			higherIndex--;
		}
		for(int i:array){
			System.out.print(" "+i);
		}
	}

	public static void main(String[] args){
		int[] input ={0, 1, 2 ,4 ,5 ,6, 7};
		RotateArrayAtPivot  ra = new RotateArrayAtPivot();
		ra.rotate(input);
		
	}
	
}
