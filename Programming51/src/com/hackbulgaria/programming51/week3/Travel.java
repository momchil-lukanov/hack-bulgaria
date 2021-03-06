package com.hackbulgaria.programming51.week3;

public class Travel {
	public String country = "";
	public String city = "";
	public int vat;
	public int totalExpense;
	public Employee[] arrayEmployees = new Employee[2];
	public int maxExpenses;
	public int maxExpenses2;

	public Travel(String city, String country, int vat) {
		this.country = country;
		this.city = city;
		this.vat = vat;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public int getVat() {
		return vat;
	}

	public void addExpense(TravelExpense travelexpense) {
		totalExpense += travelexpense.expense;
		if (maxExpenses < travelexpense.expense && maxExpenses >= maxExpenses2) {
			maxExpenses = travelexpense.expense;
			arrayEmployees[0] = travelexpense.employee;
		} else if (maxExpenses2 < travelexpense.expense
				&& maxExpenses2 <= maxExpenses) {
			maxExpenses2 = travelexpense.expense;
			arrayEmployees[1] = travelexpense.employee;
		}
	}

	public int totalCost() {
		double result = (int) (double) totalExpense * 1.2;
		int result2 = (int) result;
		return result2;
	}

	public int totalNetCost() {
		return totalExpense;
	}

	public Employee[] mostExpensesMadeBy() {
		return arrayEmployees;
	}
}
