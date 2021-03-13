package com.class06;

import java.util.Scanner;

public class SwitchwithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We need to identify favorite food
		 * 
		 * We need to capture country from a user then based on the country identify
		 * favorite food
		 * 
		 */

		Scanner input;
		String country, food;
		input = new Scanner(System.in);

		System.out.println("Please enter your country");

		country = input.nextLine();

		switch (country.toLowerCase()) {//or country.toUpperCase
		case "USA":
			food = "burger";
			break;
		case "Afganistan":
			food = "kebab";
			break;
		case "Vietnam":
			food = "Pho";
			break;
		case "belarus":
			food = "draniki";
			break;
		case "Uzbekistan":
			food = "Plow";
			break;
		case "Mexico":
			food = "tacos";
			break;
		default:
			food = "Unknown";

		}

		System.out.println("your favorite food is " + food);

	}

}
