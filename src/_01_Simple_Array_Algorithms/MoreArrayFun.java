package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
 void strarray( String[] arr) {
	for( int i = 0; i < arr.length-1; i++) {
		System.out.println(i);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
 void strarray2( String[] arr) {
		for( int i =  arr.length-1; i > -1; i--) {
			System.out.println(i);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
 void strarray3( String[] arr) {
	 boolean toprint = true;
		for( int i =  arr.length-1; i > -1; i--) {
			if( toprint == true) {
			System.out.println(i);
			toprint = false;
			}else {
				toprint = true;
			}

		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
