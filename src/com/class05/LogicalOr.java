package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*true||true-->true
 * true||false -->true
 * false||false-->false
 * false||true-->true
 * ____________________________
 * ____________________________
 * if day is Tuesday or Wednesday-->manual class
 * if Monday or Friday--is your day of
 * if thursda-->review
 * is Sat or Sunday -->Java class
 */
		
		String day="";
	
	if(day.equals("Monday")   ||    day.equals("Friday")) {
		System.out.println("Today i have no class");
	}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
		System.out.println("today i have a manual class");
	}else if(day.equals("Tursday")) {
		System.out.println("today i have a review class");
	}else if (day.equals("staurday") || day.equals("sunday")) {
		System.out.println("today i have java");
	
	}else {
		System.out.println(day+" is invalid");
	}
	
	
	
	
	
	}

}
