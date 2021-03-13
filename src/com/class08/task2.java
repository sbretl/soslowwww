package com.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that reads a range of integers (start and end point),
 *  provided by a user and then from that range prints the sum of the even and odd integers.


 *Write a program to ask a user to enter item 
 *they want to buy and the price of that item.
 *Every time user enters money,
 *accumulate the amount and tell the user how much is left to pay off.
 *  If user give more money program should return a change.
 *  Whenever a user done with payments program should say “Thank you for shopping!”
 */
		
		Scanner scan= new Scanner(System.in);
		int start,end;
		int odd=0;
		int even=0;
		System.out.println("Plese enter two numbers");
		
        start=scan.nextInt();
        end=scan.nextInt();
        
        
        for(int i=start; i<=end; i++ ) {
        
		if(i%2==0) {
			even=even+i;
			
		}else {
			odd=odd+i;
		}
		
        }
        
		
		
		
        System.out.println("sum of odd equals to" + odd);
		
        System.out.println("sum of even equals to" + even);
		
	}

}
