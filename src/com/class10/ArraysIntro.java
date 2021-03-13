package com.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array=new int[5];
	
   array[0]=10;
   array[1]=12;
   array[2]=15;
   array[3]=9;
   array[4]=13;
   
   System.out.println(array[0]+array[4]);
   double[] numbers=new double[2];
	
	numbers[0]=10.99;
	numbers[1]=19.01;
	
	numbers[0]=11.99;
	System.out.println(numbers[0]);
	
	
	String[]names=new String[4];
	names[0]="jahanzeb";
	names[1]="ozoda";
	names[2]="alex";
	names[3]="yulia";
	
	System.out.println(names[2]);
	
	boolean []b=new boolean[3];
	b[0]=true;
	b[1]=true;
	b[2]=false;
	
	System.out.println(b[2]);
	
	// to specify the size of array:
	
	int size=b.length;
	System.out.println("size of my array is "+size);
	
	
	
	
	
	
	
	
	
	
	
	}
}
