package codingbatjava;

/**
 * Given 2 arrays of integer, return true if they have the same first element 
 * or they have the same last element. Both arrays will be length 1 or more. 
 * 
 * commonEnd({1, 2, 3}, {7, 3}) true
 * commonEnd({1, 2, 3}, {7, 3, 2}) false
 * commonEnd({1, 2, 3}, {1, 3}) true
 * 
 */

public class CommonEnd {

	public static void main(String[] args) {

		int[] arrayA = new int[] {1, 2, 3, 4, 5};
		int[] arrayB = new int[] {1, 2, 3};
		
		System.out.println("functionCommonEnd: " + functionCommonEnd(arrayA, arrayB));
	}
	
	public static boolean functionCommonEnd(int[] arrayA, int[] arrayB) {
		
		if (arrayA[0] == arrayB[0] || arrayA[arrayA.length - 1] == arrayB[arrayB.length - 1]) {
			return true;
		}
		
		else {
			return false;
		}
	}
}