package com.brite.amazon;

public class me {
	
	private void NSnumber(int[] a){
		int length = a.length;
		
		for (int i=0;i<length ;i++){
			int lowNum=-1;
			for(int j=i;j<length;j++){
				if (a[j]< a[i] && a[j]>lowNum)
				{  
					lowNum = a[j];
					
				}
				
			}
			System.out.println(a[i]+"---> "+lowNum);
		}
		
		
	}

	public static void main(String[] args) {
		//int[] a ={4, 8, 5, 2, 25};
		int[] a ={13, 7, 6, 12, 8};
		FindNextLowNumber findnextlownumber = new FindNextLowNumber();
		findnextlownumber.NSnumber(a);
	}
}
