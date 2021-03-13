package com.class10;

public class ARraysTAsk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, 14, 78, 5, 90, 76 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "");
		}

		System.out.println("-------------");

		// print in reverse
		for (int i = numbers.length - 1; i > 0; i--) {
			System.out.println(numbers[i]);
		}

		String[] name = { "Eugene", "Yarina", "Ram", "Sofia", "Anastasia", "Anusha", "Samira", "Snizhana" };
		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i]);
		}
		System.out.println("------------------break----------------------");

		for (String n : name) {
System.out.print(n+" ");
		}

		
		System.out.println("----------break-----------");
		
		
		char [] grades= {'a','b','c','d','e','f'};
		
		
		for(char grade:grades){
			
			System.out.print(grade);
		}
		
		System.out.println("-------break----------");
		
		
		boolean[]boo= {true,false,true,false};
		
		for(boolean b:boo) {
			System.out.println(b);
		}
		
		
		
		
		
	}

}
