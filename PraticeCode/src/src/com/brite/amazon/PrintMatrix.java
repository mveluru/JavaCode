package com.brite.amazon;

public class PrintMatrix {
	
	private  void printMatrix (int[][] a){
		for (int i=0; i<a.length;i++){
			for (int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private  void transposeTO90 (int[][] a){
		for (int i=a.length-1;i>=0;i--){
			for (int j=a.length-1;j>=0;j--){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private  void transposeMatrix (int[][] a){
		for (int i=0; i<a.length;i++){
			for (int j=0;j<a.length;j++){
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		PrintMatrix pm = new PrintMatrix();
		pm.printMatrix(a);
		System.out.println();
		pm.transposeTO90(a);
		System.out.println();
		pm.transposeMatrix(a);
	}
}
