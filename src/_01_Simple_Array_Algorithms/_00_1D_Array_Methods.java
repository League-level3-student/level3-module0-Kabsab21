package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
    public static int sumIntArray(int[] values) {
    	int sum = 0;
    		for( int i = values.length-1; i > -1; i--) {
    			
    			sum = sum + values[i];
    		}
        return sum;
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
    	float w = 0;
		for( int i = values.length-1; i > -1; i--) {
			
			w = w + values[i];
		}
		w = w/values.length;
        return w;
    }


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
    	boolean contains = false;
    	int w = value;
		for( int i = array.length-1; i > -1; i--) {
			if( w == array[i]) {
				contains = true;
			}
		}
		return contains;
    }
			
			
  
    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	
    	int w = value;
    	int un = -1;
		for( int i = 0; i < arr.length; i++) {
			if( w == arr[i]) {
				un = i;
				break;
			}
		}
		
		return un;
    }
}
