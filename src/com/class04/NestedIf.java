package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = false;
		boolean classToday = false;

		// is it morning?-->Good mornin
		// if there is a class-->good morning class
		// if threres no class -->hello my family
		if (morning) {

			System.out.println("let me check if i have a class today");
			if (classToday) {
				System.out.println("good morning my classmates");

			} else {
				System.out.println("good morning my family");
			}

		}
		System.out.println("-----------------");

		boolean anyAllergy = true;

		boolean pollenAllergy = false;

		if (anyAllergy) {
			System.out.println("lets check which allergies you have");

			if (pollenAllergy) {
				System.out.println("stayaway from the  trees that are blooming");
			} else
				System.out.println("Ok i know you dont hav eany pollen allergy");

		} else {
			System.out.println("You are lucky not having any allergies");

		}
		System.out.println("-------------------------------------");

		// If its Friday-->go to the movie,otherwise saty at home
		// if its friday then i will check if its 13th-->if yes --.watch scary
		// movie-->if no-->
		// -->wtch any movie youd like

		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("Its a movie day!!!!");
			if (day == 13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I can watch any movie id like");
			}

		} else {
			System.out.println("Stay at home and study JAva");
		}

		System.out.println("-----------------------------------");
		// check assignment and send mesage based on score

		boolean completed = false;
		int score = 65;

		if (completed) {
			if (score >90) {
				System.out.println("gret job!");
			} else if (score > 80) {
				System.out.println("good job!");

			} else if (score > 70) {
				System.out.println("You can do better.keep trying!");
			} else {
				System.out.println("good job for trying but study more!");
			}

		} else {
			System.out.println("Please make sure to complete assignments on time");
		}
System.out.println("-------------------------------");
//nested if could be nested inside else part











	}
}
