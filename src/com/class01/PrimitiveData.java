package com.class01;

public class PrimitiveData {

	public static void main(String[] args) {

		/*
		 * byte-datatype--> what kind of values we are going to store box1-name of the
		 * variable-->label of the box 10-value that we assign to that variable-->values
		 * that we put inside the box
		 
		 */

		byte box1=127; //-128 till 127
		short box2=3276; //-32768 to 32767
		int box3=10000;  //-2147483648 to 2147483647
		long box4=1000000000000l;

		// we are storing floating numbers
		float f = 12.99f;
		double d = 12.95;

		// we are storing single character values

		char a = '*';
		char b = 'A';
		char c = '1';

		// to store boolean values

		boolean variable1 = true;
		boolean variable2 = false;
		
		// i would like to store vslue 99

		System.out.println(d);//1295
		System.out.println(a); //*
		// System.out.println(bool);program gives error because variable tool is not created at the currentmoment
		//boolean bool=true, program executes from top ==> bottom
		
		System.out.println(variable1);//true
		System.out.println("variable1");//variable1
		
		
		
		
		
		
		
	}

}
