package codingbatjava;

/**
 * Given an array of integers, return true if 6 appears as either the first or last element in the array. 
 * The array will be length 1 or more. 
 * 
 * firstLast6({1, 2, 6}) true
 * firstLast6({6, 1, 2, 3}) true
 * firstLast6({13, 6, 1, 2, 3}) false
 * 
 */

public class FirstLast6 {

	public static void main(String[] args) {

		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
		int arrayLength = array.length;
		
		System.out.println("functionFirstLast6: " + functionFirstLast6(array, arrayLength));
		
	}

	public static boolean functionFirstLast6(int[] array, int arrayLength) {
		if (array[0] == 6 || array[arrayLength-1] == 6) {
			return true;
		}
		
		else {
			return false;
		}
	}
}