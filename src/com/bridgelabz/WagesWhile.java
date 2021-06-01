package com.bridgelabz;

public class WagesWhile {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 20;

	public static void main(String args[]) {
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingdays = 0;
		int totalEmpHrs = 0;
		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingdays < NO_OF_WORKING_DAYS) {
			int empHrs = 0;
			totalWorkingdays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME: {
				empHrs = 8;
				break;
			}
			case IS_PART_TIME: {
				empHrs = 4;
				break;
			}
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;

			System.out.println("daily wage of an employee" + empWage);
		}
		System.out.println("total wage of an employee" + totalEmpWage);
	}
}
