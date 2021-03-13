package com.Class07;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class ForLoop1 {

	public static void main(String[] args) {
	
		//when we know in advance how many times we want to repeat the time of code we use FOR
        //for(int i=1; i<=3; i++){
		//System.out.println("hello");}
		
		
		
	for(int i=1; i<=3; i++) {
		System.out.println("hello");
	}
	
	//for loop syntax
	// for(initialization; condition; increment/decrement) {
	// code.....}
	
	// for(start value,end value, increment //decremnt)
	
	System.out.println("---------------print nums 1to 50-------------------------");
	for(int i=1; i<=50; i++) {
		System.out.println(i+" ");
	}
	
	
	System.out.println("-------------print from 10 to 1");
	
	for (int i=10; i>=1; i--) {
		System.out.println(i);
	}
	
	
	for(int a =0; a<=10; a+=2) {
	System.out.println(a+" ");
	}
	
	System.out.println("---------------BREAK---------------");
	
	for (int i=5; i<=50; i+=10) {
		System.out.println(i+" ");
	}
	
	
	}

}
