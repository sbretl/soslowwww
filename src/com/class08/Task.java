package com.class08;

import java.util.Scanner;

public class Task {
	
public static void main(String []args) {
	/*
	 * Print numbers from 1 to 50 except those that are divisible by 3
      *
      *Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking. 
	 */
for (int i=1; i<=50; i++) {
	if(i%3==0) {
		continue;
	}
	System.out.print(i+" ");
	
}
	System.out.println("-----------------------------------");
	
	Scanner scan=new Scanner(System.in);
	
	String answer;
	
	System.out.println("Would you like to app;y for a credit card");
	answer=scan.nextLine();
	
	while(!answer.equals("yes")) {
		if (answer.equals("yes")){
				
	         break;
	}	System.out.println("Would you like to app;y for a credit card");
	
	}
	
	
	
}
}
