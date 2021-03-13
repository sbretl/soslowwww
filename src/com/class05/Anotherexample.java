package com.class05;

import java.util.Scanner;

public class Anotherexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we have to calculate comisiion based on sales ask user to make a sale that he
		 * made based on sales we will calculate comision: if sale is less thne 10 your
		 * comisiion is 0 if sale is between 10 and 100-->comisiion is 10% if sale is
		 * between 101 to 500 -comisiion is 20 if sale isbtwenn 501 is 1000 comisiion is
		 * 30 if more comisiion is 50
		 * 
		 */

		Scanner scan;
		double saleAmount, comission;

		scan = new Scanner(System.in);
		System.out.println("please enter your sale amount");
		saleAmount = scan.nextDouble();

		if (saleAmount < 10) {
			comission = 0;

		} else if (saleAmount > 10 && saleAmount < 100) {
			comission = saleAmount * 0.1;
		} else if (saleAmount > 100 && saleAmount <= 500) {
			comission = saleAmount * 0.2;

		} else if (saleAmount > 500 && saleAmount <= 1000) {
			comission = saleAmount * 0.3;

		} else {
			comission = saleAmount * 0.5;
		}

		System.out.println("your daily comisision is " + comission);
		// if your comission is more then 500--> youre an amazing seller
		if (comission > 500) {
			System.out.println("youre an amzing seller");
		}

	}

}
