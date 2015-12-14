package codingbatjava;

/**
 * Given an integer n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21. 
 * 
 * diff21(19) 2
 * diff21(10) 11
 * diff21(21) 0
 *
 */

public class Diff21 {

	public static void main(String[] args) {

		int number = 22;
		
		System.out.println("functionDiff21: " + functionDiff21(number));
	}
	
	public static int functionDiff21(int number) {
		
		if (number > 21) {
			return 2*(number-21);
		}
		
		else {
			return 21-number;
		}
	}
}