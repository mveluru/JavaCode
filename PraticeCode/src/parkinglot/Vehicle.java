package com.brite.systemdesign.parkinglot;

public abstract class Vehicle {
	private String vechicleType;
	private String LicensePlate;
	private int requiredSpots;
	
	
	
	public Vehicle(String vtype, String licensePlate2, int rs) {
		this.vechicleType=vtype;
		this.LicensePlate=licensePlate2;
		this.requiredSpots=rs;
		
	}

	/**
	 * @return the vechicleType
	 */
	public String getVechicleType() {
		return vechicleType;
	}
	/**
	 * @param vechicleType the vechicleType to set
	 */
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return LicensePlate;
	}
	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}
	/**
	 * @return the requiredSpots
	 */
	public int getRequiredSpots() {
		return requiredSpots;
	}
	

}
