package com.hackbulgaria.programming51.week2;

public class Fraction {

	int num = 0;
	int den = 0;

	public Fraction() {
		this.num = num;
		this.den = den;
	}

	public String toString() {
		String result = num + "/" + den;
		return result;
	}

	public double getReal() {
		double result = 0;
		return result = (double) num / (double) den;
	}

	public void sum(Fraction F) {
		if (den > F.den) {
			int commonD = den / F.den;
			num = F.num*commonD + num;
		}
		if (den < F.den) {
			int commonD = F.den / den;
			den = den*commonD;
			num = num*commonD + F.num;
		}
	}
	
	public void simplify(){
		if (den / num != 0){
			int common = den / num;
			den = den / num;
			num = num / common;
		}
	}

}
