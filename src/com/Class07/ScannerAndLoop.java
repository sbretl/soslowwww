package com.Class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//capture 5 diferent names and 5  times and say hello to them
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int q=0;
		while(q<5) {
		
		System.out.println("pleae enter your name");
				name=scan.nextLine();
		System.out.println("hello "+name);
		
		q++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
