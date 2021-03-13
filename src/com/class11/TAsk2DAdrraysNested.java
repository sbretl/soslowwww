package com.class11;

public class TAsk2DAdrraysNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create 2D array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array using 2 different loops
		 */

		/*
		 * Using 2D array create a grocery list. Inside you should have an array of
		 * veggies, fruits, dairy and sweets. Retrieve all values from that array using
		 * 2 different loops
		 */
	
		
		
		String[][]cars= {
				{"Ford","lincoln","tesla"},
				{"BMW","MErcedes","opel"},
				{"Hunday","kia","samsung"},
				{"Maerati","fiat","ferrari"}
		};
	
	for(int r=0; r<cars.length; r++) {
		for (int c=0; c<cars[r].length; c++){
			System.out.println( cars [r][c]);
			
			
			for(String[]brands:cars) {
				for(String car:brands) {
				}
				System.out.println();
				}
			}
		}
	}
	
	
	
	
	
	
	
	}
	


