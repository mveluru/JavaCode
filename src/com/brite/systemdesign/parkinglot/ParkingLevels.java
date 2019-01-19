package com.brite.systemdesign.parkinglot;

public final class ParkingLevels {
	private  String parkingLevelName;
	private  int PrakingLotCapcity;
	private  int levelCounter;
	
	
	
	public  ParkingLevels(String levelName , int prakingLotCapcity){
		this.parkingLevelName = levelName;
		this.PrakingLotCapcity = prakingLotCapcity;
		this.levelCounter=0;
		
	}
	
	
	/**
	 * @return the parkingLevelName
	 */
	public String getParkingLevelName() {
		return parkingLevelName;
	}
	/**
	 * @param parkingLevelName the parkingLevelName to set
	 */
	public void setParkingLevelName(String parkingLevelName) {
		this.parkingLevelName = parkingLevelName;
	}
	/**
	 * @return the prakingLotCapcity
	 */
	public int getPrakingLotCapcity() {
		return PrakingLotCapcity;
	}
	/**
	 * @param prakingLotCapcity the prakingLotCapcity to set
	 */
	public void setPrakingLotCapcity(int prakingLotCapcity) {
		PrakingLotCapcity = prakingLotCapcity;
	}


	/**
	 * @return the levelCounter
	 */
	public int getLevelCounter() {
		return levelCounter;
	}


	/**
	 * @param levelCounter the levelCounter to set
	 */
	public void setLevelCounter(int levelCounter) {
		this.levelCounter = levelCounter;
	}

}
