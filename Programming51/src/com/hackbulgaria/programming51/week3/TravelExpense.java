package com.hackbulgaria.programming51.week3;

public class TravelExpense {
	public Employee employee;
	public String type;
	public int expense;

	public TravelExpense(String type, Employee employee, int expense) {
		this.employee = employee;
		this.type = type;
		this.expense = expense;
	}

	public String getType() {
		return type;
	}

	public Employee getEmployee() {
		return employee;
	}
	
	public int getNetCost(){
		return expense;	
	}
	
}
