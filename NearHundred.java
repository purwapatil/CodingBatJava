package codingbatjava;

/**
 * Given an integer n, return true if it is within 10 of 100 or 200. 
 * Note: Math.abs(number) computes the absolute value of a number. 
 * 
 * nearHundred(93) true
 * nearHundred(90) true
 * nearHundred(89) false
 * 
 */

public class NearHundred {

	public static void main(String[] args) {

		int number = 189;
		
		System.out.println("Math.abs(number): " + Math.abs(number));
		
		System.out.println("functionNearHundred: " + functionNearHundred(number));
	}
	
	public static boolean functionNearHundred(int number) {

		if (Math.abs(100 - number) <= 10 || Math.abs(200 - number) <= 10) {
			return true;
		}
		
		else {
			return false;
		}
	}
}