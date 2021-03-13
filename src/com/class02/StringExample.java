package com.class02;

public class StringExample {

	public static void main(String[] args) {

		String name;
		name = "Chris";

		String greeting = "Good Morning";
		String phoneNumber = "123-456-789";

		String stringNumber = "12";

		String Space = " ";
		String letter = "A";
		String letter2 = "A ";
		char oneLetter = 'A';

		// Hello,my name is Chris

		System.out.println("hello my name is " + name);

		//how are you Chris?
		
		System.out.println("how are you " + name);
		
		int age=25;
		//I am 25
		System.out.println("I am"+age);
		
		char grade='A';
		
		//Chris is A student
		
		System.out.println(name +" is " +grade + " student");
		
	/*
	 * String concatenationoperator + can be used when
	 * we attach String to another String
	 * we attach String to a number
	 * we attach String to any character or boolean
	 */
		 String car="Tesla";
		 int year=2021;
		 
		 //I drive 2021 Tesla
	 System.out.println("i drive " + year+" "+car);	 
		
	 String computer="Macbook";
	 int memory=250;
	 
	 //Chris has Macbook with 250 GB memory
	 
	 System.out.println(name +" has "+ computer+ " with "+ memory+" GB memory");
	 
	  String combinedValue=year+" "+car;//2021 Tesla	
	  System.out.println(combinedValue);
		
		byte day=7;
				String month="february";
	 String date = month+day;
	  System.out.println(date);
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
