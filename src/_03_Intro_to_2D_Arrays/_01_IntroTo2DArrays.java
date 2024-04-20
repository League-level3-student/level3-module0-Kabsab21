package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int[][] array2Dx3 = new int[3][3];
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        for( int i = 0; i < array2Dx3.length; i++) {
        	for( int j = 0; j < array2Dx3[i].length; j++) {
        		array2Dx3[i][j] = j + 1;
        		if( i == 1 &&  j == 2) {
        			System.out.println(array2Dx3[i][j]);
        			array2Dx3[i][j] = 400;
        			System.out.println(array2Dx3[i][j]);
        		}
        	}
        }
        // 3. print the third element from the second 1D array (2DArray[1][2])

        // 4. set the third element from the second 1D array to a different
        //    value

        // 5. print the element again and verify the value has changed

    }
}
