package com.brite.pattern.observer;

public class Loan extends Subject {
   
	private float interest;
	private String type;
	  
    private String bank;
    
    public Loan(String bank, String type,float interest){
    	this.bank=bank;
    	this.type=type;
    	this.interest=interest;
    }
    
    
    
	/**
	 * @return the interest
	 */
	public float getInterest() {
		return interest;
	}



	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	/**
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}



	/**
	 * @param interest the interest to set
	 */
	public void setInterest(float interest) {
		this.interest = interest;
		notifyObservers();
	}



	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}



	/**
	 * @param bank the bank to set
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}



	



	@Override
	public void notifyObservers() {
		observers.forEach((o)->{o.update(interest);
			
		});
	}

}
