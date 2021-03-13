package com.class08;

import java.util.Scanner;

public class WhilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //we need to make user to pay for a soda
		//keep aking ti pay until enters 3;
		//if user gives more them 3 -->please give less money
		//if less then 3-->please give more money;
		
		
		Scanner scan =new Scanner(System.in);
		
		double price=3;
		double money=0;
	 
		System.out.println("Please Pay for your soda");
		money=scan.nextInt();
		
	 while(money!=3) {		
		
          if(money>3) {
        	  System.out.println("please give less money");
        		money=scan.nextInt();
          }else if(money<3) {
        	  System.out.println("please add more money");
        		money=scan.nextInt();
       
        	  
          }
          }
	 System.out.println("Enjoy your soda");
	}

}
