package com.class10;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array). 
		 * Create an
		 * array of words: Java, Saturday, day, coding, is. Print the following sentence
		 * using elements of array: “Saturday is Java coding Day”.
		 */
	
	String[]names= new String[8];
	names[0]="Eugene";
	names[1]="Yarina";
	names[2]="Ram";
	names[3]="Soifa";
	names[4]="Anastasia";
	names[5]="Anusha";
	names[6]="Samira";
	names[7]="Snizana";
	
	System.out.println("My name is "+names[3]);
	
	String[] name={"Eugene", "Yarina" ,"Ram","Sofia","Anastasia","Anusha","Samira","Snizhana"};
	System.out.println("My name is "+names[3]);
	
	for(int i=0; i<names.length;i++) {
		System.out.println(names[i]);
	}
	String [] word=new String[5];
	
	word[0]="Java";
	word[1]="Saturday";
	word[2]="Day";
	word[3]="Coding";
	word[4]="is";
	
	System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	
	
	String [] sentense={"Java","Saturday","day","coding","is"};
	System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	
	
	
	
	}

}
