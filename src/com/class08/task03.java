package com.class08;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner scan=new Scanner(System.in);
		
		String item;
		double money = 0,price=0,remainder=0;
		 double change=0;
		 double sum=0;
		
		System.out.println("please enter the item ");
		item=scan.nextLine();
		
		System.out.println("please enter the price of the item ");
		price=scan.nextDouble();
		
		System.out.println("please pay for your item");
		money=scan.nextDouble();
		
		
		do {
			System.out.println("please pay for th item");
			money=scan.nextDouble();
				if(sum<price) {
					sum= sum+ money;//sum+=money;
					remainder=price-sum;
					
					System.out.println("please enter "+ remainder);
				}else if(sum>price) {
					remainder=money-price;
					System.out.println("here is your vhange "+ remainder);
				}else {
					System.out.println("you got the right amount");
				}
		}while(price!=money);
		
		System.out.println("Thank you for shopping");
		
	}

}
