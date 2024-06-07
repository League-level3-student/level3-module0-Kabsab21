/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {
	static int[] coord = new int[2];
	// void findCow(int )

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		// int[] wahat = new int[2];
		ifVF(field);
		ifVB(field);
		ifHF(field);
		ifHB(field);
		/// ifS(field);
		System.out.println(" VF:" + ifVF(field) + "VB:" + ifVB(field) + "HF:" + ifHF(field) + "HB:" + ifHB(field));
		System.out.println("COORDINATE HERE");
		System.out.println(coord[0] + " " + coord[1]);

//        for( int i = 0; i < field.length; i++) {
//        	for( int j = 0; j < field[i].length; j++) {
//        		if( j+1 >= field[i].length) {
//        			wahat[1] = i;
//        			wahat[0] = j;
//        			  System.out.println(wahat[0]+" "+wahat[1]);
//        			  return wahat;	
//        			
//        		} else if( field[i][j] == 'c' ) {
//        			if( field[i][j+1] != 'o' || field[i+1][j+1] != 'o') {
//        				if( field[i][j+2] != 'w' || field[i+2][j+2] != 'w' ) {
//        			wahat[1] = i;
//        			wahat[0] = j;
//        			  System.out.println(wahat[0]+" "+wahat[1]);
//        			  return wahat;	
//        			 
//        						}
//        				
//        					} 
//  	
//                		}
//	
//        			}
//        		
//        		}
//        return wahat;  
		return coord;
	}

	public static Boolean ifVF(final char[][] field) {
		Boolean isVerticle = false;
		int[] coo = new int[2];
		int PatternReq = 0;

		for (int i = 0; i < field.length; i++) {

			for (int j = 0; j < field[i].length; j++) {

				if (field[i][j] == 'c') {

					if (i + 2 >= field.length) {
						coo[1] = i;
						coo[0] = j;
					} else if (field[i + 1][j] == 'o') {

						if (field[i + 2][j] == 'w') {

							PatternReq++;

						}
					} else {
						coo[1] = i;
						coo[0] = j;
					}
				}
			}

		}
		if (PatternReq >= 2) {
			isVerticle = true;
			coord = coo;
		}

		return isVerticle;
	}

	public static Boolean ifVB(final char[][] field) {
		Boolean isVerticle = false;
		int PatternReq = 0;
		int[] coo = new int[2];
		for (int i = 0; i < field.length; i++) {

			for (int j = 0; j < field[i].length; j++) {

				if (field[i][j] == 'c') {

					if (i -2 <= 0) {
						coo[1] = i;
						coo[0] = j;
					} else if (field[i - 1][j] == 'o') {

						if (field[i - 2][j] == 'w') {

							PatternReq++;

						}
					} else {
						coo[1] = i;
						coo[0] = j;
					}
				}
			}

		}
		if (PatternReq >= 2) {
			isVerticle = true;
			coord = coo;
		}

		return isVerticle;
	}

	public static Boolean ifHF(final char[][] field) {
		Boolean isHorozontal = false;
		int PatternReq = 0;
		int[] coo = new int[2];
		for (int i = 0; i < field.length; i++) {

			for (int j = 0; j < field[i].length; j++) {

				if (field[i][j] == 'c') {

					if (j + 1 >= field[i].length) {
						coo[1] = i;
						coo[0] = j;
					} else if (field[i][j + 1] == 'o') {

						if (field[i][j + 2] == 'w') {

							PatternReq++;

						}
					} else {
						coo[1] = i;
						coo[0] = j;
					}
				}
			}

		}
		if (PatternReq >= 2) {
			isHorozontal = true;
			coord = coo;
		}

		return isHorozontal;
	}

	public static Boolean ifHB(final char[][] field) {
		Boolean isHorozontal = false;
		int PatternReq = 0;
		int[] coo = new int[2];
		for (int i = 0; i < field.length; i++) {

			for (int j = 2; j < field[i].length; j++) {

				if (field[i][j] == 'c') {

//           			if( j+1 >= field[i].length) {
//                   		coo[1] = i;
//                   		coo[0] = j;
//                   		}	else 
					if (field[i][j - 1] == 'o') {

						if (field[i][j - 2] == 'w') {

							PatternReq++;

						}
					} else {
						coo[1] = i;
						coo[0] = j;
					}
				}
			}

		}
		if (PatternReq >= 2) {
			isHorozontal = true;
			coord = coo;
		}

		return isHorozontal;
	}

	public static Boolean ifS(final char[][] field) {
		Boolean isSame = false;
		int PatternReq = 0;
		int[] coo = new int[2];
		for (int i = 0; i < field.length; i++) {

			for (int j = 0; j < field[i].length - 2; j++) {

				if (field[i][j] == 'c') {

					if (field[i][j + 1] == field[i][j + 2]) {

						if (field[i][j + 1] == field[i][j + 2]) {

							PatternReq++;

						}
					} else {
						coo[1] = i;
						coo[0] = j;
					}
				}
			}

		}
		if (PatternReq >= 2) {
			isSame = true;
			coord = coo;
		}

		return isSame;
	}

}
