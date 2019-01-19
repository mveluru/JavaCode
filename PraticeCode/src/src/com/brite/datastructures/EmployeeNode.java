package com.brite.datastructures;

import com.brite.model.Employee;

public class EmployeeNode {
	private Employee employee;
	private EmployeeNode next;
	
	public EmployeeNode(Employee emp){
		this.employee=emp;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}

	
}
