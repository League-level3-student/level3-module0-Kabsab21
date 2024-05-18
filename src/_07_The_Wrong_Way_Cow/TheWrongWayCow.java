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
	
	//void findCow(int )

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int[] wahat = new int[2];
        for( int i = 0; i < field.length; i++) {
        	for( int j = 0; j < field[i].length; j++) {
        		if( j+1 >= field[i].length) {
        			wahat[1] = i;
        			wahat[0] = j;
        			  System.out.println(wahat[0]+" "+wahat[1]);
        			  return wahat;	
        			
        		} else if( field[i][j] == 'c' ) {
        			if( field[i][j+1] != 'o' || field[i+1][j+1] != 'o') {
        				if( field[i][j+2] != 'w' || field[i+2][j+2] != 'w' ) {
        			wahat[1] = i;
        			wahat[0] = j;
        			  System.out.println(wahat[0]+" "+wahat[1]);
        			  return wahat;	
        			
        						}
        				
        					} 
  	
                		}
		
        			}
        		
        		}
        return wahat;  
        
    		}
    
}




    


