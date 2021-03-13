package com.class06;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Store gender using M or F based on the gender we will specify if M -->male if
		 * F--> female otherwise -->not sure
		 */

		char gender = 'k';
		String description;

		switch (gender) {

		case 'M':
			description = "Male";
			break;

		case 'F':
			description = "Female";
			break;
		default:
			description = "N/A";
		}

		System.out.println(description);
		
		//LIMITATION:
		//switch cant use relational or logical operators
		// what it does it simply checks the value
		
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am happy");
			
		}
		
		
		
		}
		

	}

}
