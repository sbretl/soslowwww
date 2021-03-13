package com.class11;

import java.util.Scanner;

public class PracticeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String element;
		String[] array ;
		
		
		System.out.println("how many elements would you like to store?");
		int size=scan.nextInt();	
		array=new String[size];
		
		for(int i=0; i<size; i++) {
			
			System.out.println("please enter a String");
			element=scan.next();
			array[i]=scan.next();
		}
		
		System.out.println("---------------Lets see what we have stored-------------");
		for(String str: array) {
			System.out.println(str+" ");
		}
		
	}

}
