package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		 /*Write a program to ask a user to enter item they want to buy and the price of that item.
		 *Every time user enters money,
		 *accumulate the amount and tell the user how much is left to pay off.
		 *  If user give more money program should return a change.
		 *  Whenever a user done with payments program should say “Thank you for shopping!”
		 */
	
		Scanner scan=new Scanner(System.in);
		
		String item;
		double money = 0,price=0,difference=0;
		 double change=0;
		
		System.out.println("please enter the item ");
		item=scan.nextLine();
		
		System.out.println("please enter the price of the item ");
		price=scan.nextDouble();
		
		System.out.println("please pay for your item");
		money=scan.nextDouble();
		
		while(money!=price) {
			difference=price-money;
			System.out.println("please pay "+ difference+" more");
	
			if(money>price) {
				change=money-price;
				System.out.println("please take your change "+change);
				break;
				
			}
			
				
		
		}
		
	}

}
