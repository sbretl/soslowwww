package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		//to donate  you must be 18> age
		//to donate  weight must be >110lbs

		
		int age=19;//age is my outer condition
		int weight=111;
		if(age>=18) {
			System.out.println("You are eligible to donate blood");
			if( weight>=110) {
				System.out.println("Thank you for becoming a blood donor");
			}else {
				System.out.println("Eat and excercise more");
			}
		}else {
			System.out.println("You are not eligible to donate blood.see you in some years!");
		}
		
		
		
		
	}

}
