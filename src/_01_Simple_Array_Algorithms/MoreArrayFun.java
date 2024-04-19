package _01_Simple_Array_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun fyup = new MoreArrayFun();
		  String[] arr = {"bianca", "orange", "red", "green"};
	         fyup.strarray(arr);
	         fyup.strarray2(arr);
	         fyup.strarray3(arr);
	         fyup.strarray4(arr);

		
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
 void strarray( String[] arr) {
	for( int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
 void strarray2( String[] arr) {
		for( int i =  arr.length-1; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
 void strarray3( String[] arr) {
	 boolean toprint = true;
		for( int i =  arr.length-1; i > -1; i--) {
			if( toprint == true) {
			System.out.println(arr[i]);
			toprint = false;
			}else {
				toprint = true;
			}

		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
 void strarray4( String[] arr) {
	 Random r = new Random();
	 boolean toprint = false;
		for( int i =  arr.length-1; i > -1; i--) {
			 int rat = r.nextInt(2);
			 if( rat == 0) {
			 toprint = true;
			 } else {
				 toprint = false;
			 }
			if( toprint == true) {
			System.out.println(arr[i]);
			
			}

		}
	}


}
