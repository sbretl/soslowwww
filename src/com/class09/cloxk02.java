package com.class09;

public class cloxk02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int h = 0; h <= 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h<10) {
					System.out.print("0"+ h + ":");
				} else {
					System.out.print(h + ":");
				}
						
				if (m<10) {
					System.out.println("0"+ m);
				} else {
					System.out.println(m);
				}
			}
		}
	}

}

for (int a = 0; a <= 23; a++) {
	for (int b = 0; b < 6; b++) {
		for (int c = 0; c <= 9; c++) {
			if (a < 10) {
				System.out.println("0" + a + ":" + b + "" + c);
			} else
				System.out.println(a + ":" + b + "" + c);
		}






