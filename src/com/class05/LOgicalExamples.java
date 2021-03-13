package com.class05;

import java.util.Scanner;

public class LOgicalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask user to enter age
		// based on the age we will define
		// if age is 1to3--youre a baby
		// if age is 3to5---youre a bigger baby
		// 5-12--youre a kid
		// 13-19---teenager
		// age is above 20----youre an adult

		Scanner input;
		int age;
		String name;
		input = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = input.nextLine();
		System.out.println("Please enter your age");
		age = input.nextInt();
		
		if(age>=1 && age<3) {
			System.out.println(name+ "you are a baby");
		}else if (age>=3 && age<5) {
			System.out.println(name+ " You are a bigger baby");
		}else if(age>=5 && age<=12) {
			System.out.println(name+ " You are a kid");
		}else if(age>=13 && age<=19) {
			System.out.println(name+ "You are a teenager");
		}else {
			System.out.println("Youre an adult");
		}

	}
}