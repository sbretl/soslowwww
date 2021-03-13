package com.class06;

import java.util.Scanner;

public class workingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double price ,discount,discountP;
String item;
Scanner scan= new Scanner(System.in);
System.out.println("do we have a sale today");

boolean sale= scan.nextBoolean();

if(!sale) {
	System.out.println("Im not going shopping");
}else {
	System.out.println("Do you have the item");
	item=scan.next();
	System.out.println("Whats the price of that item");
price=scan.nextDouble();
}

if (price<10) {
	discount=price*0.05;
	dicountP=price-discount;
	
	
}else if (price>+10 && price<100) {
	discount=price*0.1;
	dicountP=price-discount;
}else if (price>+10 && price<100) {
	discount=price*0.1;
	dicountP=price-discount;
























	}

}
