package codingbatjava;

/**
 * Given an array of integers, return true if the array is length 1 or more, 
 * and the first element and the last element are equal. 
 * 
 * sameFirstLast({1, 2, 3}) false
 * sameFirstLast({1, 2, 3, 1}) true
 * sameFirstLast({1, 2, 1}) true
 * 
 */

public class SameFirstLast {

	public static void main(String[] args) {

		int[] array = new int[] {1, 2, 3, 4, 5};
		int arrayLength = array.length;
		
		System.out.println("functionSameFirstLast: " + functionSameFirstLast(array, arrayLength));
	}

	public static boolean functionSameFirstLast(int[] array, int arrayLength) {
		
		if (arrayLength >= 1 && array[0] == array[arrayLength - 1]) {
			return true;
		}
		else {
			return false;
		}
	}
}
