package codingbatjava;

/**
 * Given two integer values, return their sum. Unless the two values are the same, then return double their sum. 
 * 
 * sumDouble(1, 2) 3
 * sumDouble(3, 2) 5
 * sumDouble(2, 2) 8
 * 
 */

public class SumDouble {

	public static void main(String[] args) {

		int a = 2;
		int b = 2;
		
		System.out.println("functionSumDouble: " + functionSumDouble(a, b));
	}

	public static int functionSumDouble(int a, int b) {

		// if a and b are equal return twice their sum
		if (a == b) {
			return 2*(a+b);
		}
		
		// if a and b are not equal return their sum
		else {
			return a+b;
		}
	}
}