package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] namend = new String[5];
    	namend[0] = "red";
    	namend[1] = " two-hundred-twenty-three";
    	namend[2] = "how to spell that fancy word for cooking that starts with and s ( satay?? saute?? sauttayyee)";
    	namend[3] = "wwwwwwwwwwwwwwwwwwwwwgggghdsssss";
    	namend[4] = " the afterlife but for fish";
    
    	
        // 2. print the third element in the array
    	System.out.println(namend[2]);

        // 3. set the third element to a different value
    	namend[2] = "french spelling in english makes me want to cry";
        // 4. print the third element again
    	System.out.println(namend[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for( int i = 0; i < namend.length; i++) {
    		String nesquick = namend[i];
    		nesquick = "the french language should be charged with war crimes because how the hell do you spell sautay??????";
    	 System.out.println(nesquick);
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
//above
        // 7. make an array of 50 integers
    	int[] intes = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random r = new Random();
    	for( int i = 0; i < intes.length; i++) {	
    		
   intes[i] = r.nextInt(50);
   System.out.println(intes[i]);
 
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
for(Integer i: intes) {
	if( intes[i] == 0) {
		System.out.println(" smallest: "+intes[i]);
	}
	if( intes[i] == 49) {
		System.out.println(" largest: "+intes[i]);
	}
}
System.out.println(" last: "+intes[49]);


        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
