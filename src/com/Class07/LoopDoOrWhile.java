package com.Class07;

import java.util.Scanner;

public class LoopDoOrWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * we play the lottery and we have a win number
		 * we need to keep asking the user to enter nay number from 1to 100;
		 * Until correct number is entered;
		 *
		 */
		
		Scanner input=new Scanner(System.in);
		int num;
		int lotteryNumber=17;
		
		
		
		
		do {
		System.out.println("Please enter your number from 1 to 100 to win the lottery");
        num=input.nextInt();
		}while(num!=lotteryNumber);
        
        
        System.out.println("congrtas,you hav entered " +num+ " which is  alucky number");
	}

}
