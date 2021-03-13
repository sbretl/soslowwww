package com.class05;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input =new Scanner(System.in);
		 System.out.println("Please enter your height in inches");
		int height=input.nextInt();
		
		
	
		String definition;
		
		if(height<=60) {
			definition="short";
			
		}else if(height>60 && height<=72) {
			definition="medium";
		}else {
			definition="tall";
		}
System.out.println("you are person whos height is ");		
		
		
		
		
		
		
		
		

	}

}
