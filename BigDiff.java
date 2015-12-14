package codingbatjava;

/**
 * Given an array length 1 or more of integer, return the difference between 
 * the largest and smallest values in the array.
 * 
 *  bigDiff({10, 3, 5, 6}) 7
 *  bigDiff({7, 2, 10, 9}) 8
 *  bigDiff({2, 10, 7, 2}) 8
 *  
 */

public class BigDiff {
	
	public static void main(String[] args) {

		int[] array = new int[] {1, 2, 3, 4, 5};
		
		System.out.println("functionBigDiff: " + functionBigDiff(array));
	}
	
	public static int functionBigDiff(int[] array) {
		int largest = array[0];
		int smallest = array[0];
		int difference = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
			else if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		
		difference = largest - smallest;
		return difference;
	}
}