package com.class06;

public class SwitchSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 3;
		String weekDay;

		if (day == 1) {
			weekDay = "m";

		} else if (day == 2) {
			weekDay = "t";
		} else if (day == 3) {
			weekDay = "w";
		} else if (day == 4) {
			weekDay = "thur";
		} else if (day == 5) {
			weekDay = "f";
		} else if (day == 6) {
			weekDay = "s";
		} else if (day == 7) {
			weekDay = "su";

		} else {
			weekDay = "invalid";
		}

		if (!weekDay.equals("invalid")) {
			System.out.println("today is " + weekDay);

		}

		System.out.println("------------h------------------");

		// is a value based
//values MUST MATCH variable type
		
		String weekDay1;
		switch (day) {

		case 1:
			weekDay1 = "m";
			break;
		case 2:
			weekDay1 = "t";
			break;
		case 3:
			weekDay1 = "w";
			break;
		case 4:
			weekDay1 = "thur";
			break;
		case 5:
			weekDay1 = "f";
			break;
		case 6:
			weekDay1 = "s";
			break;
		case 7:
			weekDay1 = "su";
			break;

		default:
			weekDay1 = "Invalid";
			
		}
		System.out.println(weekDay1);
if(!weekDay1.equals("Invalid")) {
	System.out.println();
}
	}

}
