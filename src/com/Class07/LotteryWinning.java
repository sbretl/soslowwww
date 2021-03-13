package com.Class07;

import java.util.Scanner;

public class LotteryWinning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int num;
		int lotteryNumber=17;
		
		
		System.out.println("Please enter your number from 1 to 100 to win the lottery");
        num=input.nextInt();
        
		while(num!=lotteryNumber) {
        
			System.out.println("Please enter your number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}
        System.out.println("congrtas,you hav entered " +num+ " which is  alucky number");
        // when we dont know in advance how many times to reapet a block of code==>we go for While or DO While loops
        //when we know in advance how many times we want to repeat the time of code we use FOR
        
	}

}
