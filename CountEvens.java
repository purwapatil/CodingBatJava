package codingbatjava;

/**
 * Return the number of even integers in the given array. 
 * 
 * countEvens({2, 1, 2, 3, 4}) 3
 * countEvens({2, 2, 0}) 3
 * countEvens({1, 3, 5}) 0
 * 
 */

public class CountEvens {

	public static void main(String[] args) {

		int[] array = new int[] {1, 2, 3, 4, 5};
		
		System.out.println("functionCountEvens: " + functionCountEvens(array));
	}
	
	public static int functionCountEvens(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}