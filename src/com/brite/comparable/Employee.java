package com.brite.comparable;

public class Employee {
	private int age;
	private String fullName;
	
	public Employee(int age,String fullName) {
		this.age=age;
		this.fullName=fullName;
	}
	
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [age=" + age + ", fullName=" + fullName + "]";
	}

	

}
