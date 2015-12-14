package codingbatjava;

/**
 * Given a non-negative integer n, compute recursively (no loops) 
 * the count of the occurrences of 8 as a digit, 
 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
 * 
 * count8(8) 1
 * count8(818) 2
 * count8(8818) 4
 * 
 */

public class Count8 {

	public static void main(String[] args) {

		int number = 150;
		
		System.out.println("functionCount8: " + functionCount8(number));
	}
	
	public static int functionCount8(int number) {
		if (number == 0) {
			return 0;
		}
		
		if (number >= 88 && number % 100 == 88) {
			return 2 + functionCount8(number/10);
		}
		if (number % 10 == 8) {
			return 1 + functionCount8(number/10);
		}
		
		else {
			return functionCount8(number/10);
		}
	}
}