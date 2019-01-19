package com.brite.pattern.observer;

public class FederalLive {
	  public static void main(String args[]) {
          // this will maintain all loans information
          Channel01 printMedia = new Channel01();
          Internet onlineMedia = new Internet();

          Loan personalLoan = new Loan("Personal Loan","Standard Charterd", 12.5f );
          personalLoan.registerObserver(printMedia);
          personalLoan.registerObserver(onlineMedia);
          personalLoan.setInterest(3.5f);

   }




}
