package codingbatjava;

/**
 * Given a non-negative integer n, return the sum of its digits recursively (no loops). 
 * 
 * sumDigits(126) 9
 * sumDigits(49) 13
 * sumDigits(12) 3
 * 
 */

public class SumDigits {

	public static void main(String[] args) {
		
		int number = 150;

		System.out.println("functionSumDigits: " + functionSumDigits(number));
	}
	
	public static int functionSumDigits(int number) {
		
		if (number <= 9) {
			return number;
		}
		
		else {
			return number%10 + functionSumDigits(number/10);
		}
	}
}
