package com.class06;

import java.util.Scanner;

public class SomeonesCodeWTF {

		public static void main(String[] args) {
			double discount,totalPrice;
			Scanner input = new Scanner(System.in);
			System.out.println("Is there is any sale!!!!");
			String ans = input.next();
			if(!(ans.equals("yes"))) {
				System.out.println("How many items are in sale?");
				System.out.println("What are the prices?");
				int price=input.nextInt();
				if(price>10) {
					totalPrice=price-(price*0.05);
					discount=price*0.05;
				} else if(price>=10&&price<100) {
					totalPrice=price-(price*0.10);
					discount=price*0.10;
				}else if(price>=100&&price<500) {
					totalPrice=price-(price*0.20);
					discount=price*0.20;
				}else {
					totalPrice=price-(price*0.50);
					discount=price*0.50;
				}
				System.out.println("Your price is "+price+" and Your discount is "+discount+" Your final price is "+totalPrice);
				
				
			}else {
				System.out.println("I am not going for shopping");
			}
		}

	}

