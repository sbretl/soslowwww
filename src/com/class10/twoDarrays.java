package com.class10;

public class twoDarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num=new int[3][4];
		//1 array or first row;
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		//2 array or 2nd row;
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
	
		//3 array or 3
		
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		
		System.out.println(num[1][3]);
		System.out.println(num[2][2]);
		
		
		// int[]num{1,2,3,4,5,,67,};...
		
		//int[][] numbers={
		
	//{}- arrays inside arrays
	
	//}
		
		int[][]numbers= {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,2300,400},};
		
		System.out.println(numbers[0][2]);//3
		System.out.println(numbers[1][1]);//20
		System.out.println("-----------break--------------");
		
		int sum=numbers[1][2]+numbers[0][3];
		System.out.println(sum);
	
	numbers[2][2]=500;//we can alway change the value of the variable
	System.out.println(numbers[2][2]);
	
	System.out.println("===========break===========");
	
	
	
	
	
	
	
	
	
	}
	

}
