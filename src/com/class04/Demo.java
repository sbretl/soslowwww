package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int i=10;
		 String str="Hello";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter any text");
		
		
		String text=scan.nextLine();//this line captures your input from console.
		//once you captured test you must hit eneter
		//shortcut ctrl shft o
		
		System.out.println("texte that i enetered "+text);
		
		
		System.out.println("please enter your name");
		String name=scan.next();// captures one word ONLY till space
		System.out.println("nice to meet you "+name);
		
		System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("My name is "+ name+ "and I am "+ age+ " Years old");
        
	}

}
