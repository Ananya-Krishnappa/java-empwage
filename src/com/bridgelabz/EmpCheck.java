package com.bridgelabz;

public class EmpCheck {
	public static void main(String args[]) {
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("employee is present");
		else
			System.out.println("employee is not present");
	}
}