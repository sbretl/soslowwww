package com.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
	

		Scanner input =new Scanner(System.in);
		 System.out.println("Please enter your height in inches");
		int height=input.nextInt();
		
		
		if(height<60) {
			System.out.println("you are short");
		}else if(height>=60 && height<+72) {
			System.out.println("You are medium height");
		}else if( height>72)  {
		System.out.println("You are tall");	
		}
		
		
	
	 
		
		System.out.println("please enter the day");
		int day=input.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("its weekday");
			
		}else if (day>=6 && day<=7) {
			System.out.println("Its Weekend");
			
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
