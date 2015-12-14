package codingbatjava;

/**
 * Given a non-negative integer n, return the count of the occurrences of 7 as a digit, 
 * so for example 717 yields 2. 
 * 
 * count7(717) 2
 * count7(7) 1
 * count7(123) 0
 * 
 */

public class Count7 {

	public static void main(String[] args) {

		int number = 150;
		
		System.out.println("functionCount7: " + functionCount7(number));
	}
	
	public static int functionCount7(int number) {
		if (number == 0) {
			return 0;
		}
		if (number % 10 == 7) {
			return 1 + functionCount7(number/10);
		}
		
		else {
			return functionCount7(number/10);
		}
	} 
}