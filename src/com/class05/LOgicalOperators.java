package com.class05;

public class LOgicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//when i have to test twor more conditions we use logical operators
		// AND(&&)
		// OR(||)

		/*
		 * true&&true--> TRUE 
		 * true&&false-->FALSE 
		 * false&&true-->FALSE
		 * false&&false-->FALSE we have to identify if number is msall,medium large or x
		 * large if number between 1 and 10-->small if number between 11 and
		 * 100-->medium if number is between 101 and 1000-->Large if number is between
		 * 1001 until 1000-->X large
		 *
		 */

		int num = 200000;
		if (num < 1) {
			System.out.println("Number is 0 or negative");

		} else if (num >= 1 || num <= 10) {
			System.out.println(num + " is a small number");
		} else if (num > 11 || num <= 100) {
			System.out.println(num + " is a medium number");
		} else if (num >= 101 || num <= 1000) {
			System.out.println(num + "is a large number");
		} else if (num >= 1001 || num <= 10000) {
			System.out.println(num + "is a x large number");
		} else {
			System.out.println(num + "is a huge number");
		}

	}

}
