package com.class06;

import java.util.Scanner;

public class NotStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we need to check if there is a sale
		// if there is no sale we are not going for shopping
		//
		// if there is a sale :
		// -What is the item you are shopping for
		// whats the price?

		// we need to calculate the final price after discount
		// if price is less then 10-->apply 5% discount
		// if price is between 10 and 100-->appply 10% discount
		// if price is more then 500-->apply 30% discount
		//
		// which item you purchased,
		// what was the original price,
		// what discount applies at final price

		Scanner input = new Scanner(System.in);
		String answer;
		String item;
		int price;
		String discount;

		System.out.println("Is there any sale happening today");
		answer = input.nextLine();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Do you have a monitor on sale?");
		}
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Whats the price of it?");
			price = input.nextInt();

		}
		if (price < 10) {
			discount = "The discount is 5%";

		} else if (price >= 10 || price <= 100) {
			discount = "the discount is 10%";

		}else if (price>100 || price<500) {
			discount="The disovunt is 20 %";
			
		}else {
			discount="the discount is 30%";
		}

		
	}

}
