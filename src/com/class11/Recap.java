package com.class11;

public class Recap {
public static void main(String[]args) {
	
	
	int[]array;
	array=new int[3];
	array[0]=10;
	array[1]=12;
	array[2]=14;
	
	int[] nums = {10,12,14,44,23,78};
    int total=nums.length;	
	
	System.out.println(nums[3]);
	
	
	for(int i=0; i<nums.length;i++) {
		
		System.out.println(nums[i]);
	}
	for(int i = nums.length-1; i>=0;i--) {
		System.out.println(nums[i]);
	}
	
	System.out.println("-------------break------------");
	//Adavnaced loops only with arrays or collections
	
	
	
	//for(data type:name of the array) {
		//System.out.println(variable);
	//}
	// advanced for loop never faces " index OUT of BOunds" problem);
	
	for(int num :nums) {
		System.out.println(num);
	}
	
	
}
}
