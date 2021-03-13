package com.class08;

public class AnotherExample {

	public static void main(String[] args) {
		// KeyWords that can be used with the loops
		// break
		//continue
		
		//break-once JAva sees break it exits the loop.
		boolean rain=true;
		 int temp=90;
		
		while(rain) {
			System.out.println("I will stay at home");
			
		        if(temp>75) {
			System.out.println("i will tak e a walk unde the rain");
		
			break;
		}	
		temp+=2;
		}

		for(int i=1;i<=10; i++) {
			System.out.println("Hello,I am inside the loop");
			if(i==5) {
			
			break;
		}
		}
		
	}

}
