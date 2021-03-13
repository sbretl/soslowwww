package com.class11;

public class Array2DCrazy {

	public static void main(String[] args) {
		String[][] usa = { { "alexandria", "Oakton", "Arlington", "virginia Beach", "Fairfax" },
				{ "Philly", "Strassburg", "Pittsburgh" }, { "Boston", "Quincy", "Springsfield", "Burlington" },
				{ "LA", "Long BEach", "SF", "Sacramento", "Santa BArb" },
				{ "Miami", "orlando", "tampa", "talahassee" }, };

		System.out.println(usa.length);// will give me number of arrays
		System.out.println(usa[0].length);//will give me number of elements inside of the row
		System.out.println(usa[1].length);// variable
		System.out.println(usa[2].length);
		
		
		for (int r=0;r<usa.length;r++) {//iterates over rows
			for (int c=0; c<usa[r].length;c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
		}
		
		
		//USING NESTED FOR EACH LOOP
		System.out.println();
		
		for(String[] cities:usa) {
		
		for(String city:cities) {
			System.out.print(city+" ");
		}
		
		}
		
	}

}
