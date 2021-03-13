package com.class03;

public class Casting {

	public static void main(String[]args) {
		
		// int i=10.99; type mismatch
		//casting is converting one dtata type to another
		// casting : 2 types 1)windeining 2)narrowing
		//widening ->byte->short ->int-> long-> float-> double
		//widening happens automatically/implicit casting
		//narrowing double-float-long-int-short-byte
		//narrowing happens explicitly -manually
		double d=10;
		int num=10;
		
		System.out.println(d);
		int i=(int) 12.99;
		System.out.println(i);
		byte b=(byte)130;
		System.out.println(b);
		
	   double number =12;
		double result = number/5;
		System.out.println(result);
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum);
		
		double num1=10+10.5;
		
		System.out.println(num1);
		
	
		
	}

}
