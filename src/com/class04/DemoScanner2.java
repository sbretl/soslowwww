package com.class04;

import java.util.Scanner;

public class DemoScanner2 {

	public static void main(String[] args) {
		
		
		// Capture two numbers from a user and then we will compare them
	// short cut to import scanner ctr shft o
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("please enter first number");
	
	int num1=input.nextInt();
	
	System.out.println("Please enter second number");
	
	int num2=input.nextInt();
	
	if(num1>num2) {
		System.out.println(num1+" Is larger then "+num2);
	}else if (num1<num2) {
		System.out.println(num2+" is larger then "+num1);
	}else {
		System.out.println(num1+" is equal ti "+ num2);
		
	}
	}
	
	
	
	
	


}
