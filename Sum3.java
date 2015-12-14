package codingbatjava;

/**
 * Given an array of integer length 3, return the sum of all the elements. 
 * sum3({1, 2, 3}) 6
 * sum3({5, 11, 2}) 18
 * sum3({7, 0, 0}) 7
 * 
 */

public class Sum3 {

	public static void main(String[] args) {

		int[] array = new int[] {1, 2, 3};
		
		System.out.println("functionSum3: " + functionSum3(array));
	}
	
	public static int functionSum3(int[] array) {
		
		int sum = 0;
		sum = array[0] + array[1] + array[3];
		
		/*for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}*/
		
		return sum;
	}
}