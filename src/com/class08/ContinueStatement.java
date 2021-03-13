package com.class08;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<10; i++) {
			System.out.println("hello");
			if(i==3) {
				continue;
				
		
			}
			System.out.println("i am inisde of thr loop");
		}
		
		
		System.out.println("------------------------");
		
		//you need to print all numbers 1 to 10 but 5 and 6
		for(int i=1; i<10; i++) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.print(i+" ");
			
			
			
		}
		
		System.out.println("----------------------------------");
		
		/*
		 * you need to print number 1to 40 except divisible by 4.
		 * 
		 */
		for(int i=1; i<=40;i++) {
			if(i%4==0) {
			continue;
		}
		
			System.out.print(i+" ");	
		
	}
//continue skips current iteration?execution and code goes back to the begining;
}
}