package com.class04;

public class PracticeTaskNEstingIf {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Please consider getting a degreee");
		}
		System.out.println("-----------break---point----------------");

		double mRate = 4;
		int price = 100000;

		if (mRate > 4.5) {
			System.out.println("you will nor buy a house");
		} else {
			System.out.println("You will consider buying a house");
			if (price > 200000) {
				System.out.println("You will need a loan");
			} else {
				System.out.println("you can pay cash");
			}

		}

	}

}
