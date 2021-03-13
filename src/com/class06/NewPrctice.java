package com.class06;

import java.util.Scanner;

public class NewPrctice {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int time;
		String timeday="invalid";
		
		System.out.println("please enter the time in 24 hr format");
		time=scan.nextInt();

		
		if(time>=1 && time<=11) {
			timeday="Morning";
		}else if(time>=12 && time<=13) {
timeday="noon";
		}else if(time>=14 && time<=17) {
			timeday="afternoon";
			
	}else if(time>=18 && time<=21) {
		timeday="eve";
	}else if(time>= 22&& time<=24) {
			timeday="night";
	}
		
		System.out.println("based omn teh datat the time of the day is "+ timeday);
		
		
		//compiler can initialize variables to their default values
		//default value of int-->0
		//defualt value of double-->0.0
		//def value of boolean--> false
		//def value of string  and all non primitives-->Null
		
		
		double d=10;
		System.out.println(d);
		
	}
}
		
		
		
		
		
		
		
		
		
