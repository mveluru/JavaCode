package com.brite.amazon.datastructures.array;


public class TowersOfHanoi {

	  
	   
	   public void solves(int n,String start,String auxilary,String end){
		   if (n==1){
			   System.out.println(start + " --> " + end);
		   }else{
		   solves (n-1 ,start ,end ,auxilary);
		   System.out.println(start +" -->"+end);
		   solves(n-1,start ,auxilary,end);
		   }
	   }
	   
	   public void solve(int n, String start, String auxilary,String end){
		   if (n==1){
			   System.out.println(start+ " --> "+end);
		   }else{
			   solve(n-1,start,end,auxilary);
			   System.out.println(start+ " --> "+end);
			   solve(n-1,start,auxilary,end);
		   }
	   }

	   public static void main(String[] args) {
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       System.out.print("Enter number of discs: ");
	      // Scanner scanner = new Scanner(System.in);
	      // int discs = scanner.nextInt();
	       int discs=3;
	       towersOfHanoi.solve(discs, "A", "B", "C");
	       //towersOfHanoi.solves(discs, "D", "E", "F");
	   }
	}