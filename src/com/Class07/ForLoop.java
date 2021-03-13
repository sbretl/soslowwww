package com.Class07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//print nums from 1 to 100 in 1 line with space
		
		for(int a=1; a<=100; a++) {
		System.out.print(a+" ");
		}
		
		for(int a=101; a>=1;a--) {
			System.out.println(a);
		}
		
		
		//print even nums from 20 to 1;
		System.out.println("----------------print odd number sbetween 20 and 50---------------------------");
		for(int a=20; a<50; a++) {
				if(a%2==1) {
					System.out.print(a+" ");
				
				}
		}
		
		for(int a=21; a<50; a+=2) {
			
				System.out.print(a+" ");
			
			System.out.println("---------------------------------------");
			
			int sum=0;
			for(int i=1;i<=5;i++) {
				sum=sum+i;
			}
		System.out.println(sum);
	}

}
}