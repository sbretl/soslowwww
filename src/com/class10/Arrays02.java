package com.class10;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 char[] grade=new char[6];
	 
	 grade[0]='a';
	 grade[1]='b';	
	 grade[2]='c';
	 grade[3]='d';
	 grade[4]='e';
	 grade[5]='f';
	 
	 System.out.println(grade[1]);
		
		char [] grades= {'a','b','c','d','e','f'};
		
		System.out.println(grades[5]);
		
		
		//grades.length-THats how i find out the size;
		
		System.out.println("number of elements inn array is "+grades.length);
	
		
		
		String[]family = {"mama","papa","me"};
		System.out.println(family[2]);
	
	String[]familia=new String[3];
	
	familia[1]="mam";
	familia[2]="pap";
	familia[0]="me";
	System.out.println(familia[0]);
	}
	

}
