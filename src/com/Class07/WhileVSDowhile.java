package com.Class07;

public class WhileVSDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		
		while(num<5){//while loop is used more often.
			System.out.println("hello");
			num++;
		}
		System.out.println("--------------DO while----------");
		
		int num1=1;
		
		do {
			System.out.println(num1);
	      	num1++;
		}while(num1<=5);
			
		//WHILE checks the condition;
		//DO= first executes then checks;
		
		
		
		
	}

}
