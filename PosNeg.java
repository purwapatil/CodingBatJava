package codingbatjava;

/**
 * Given 2 integer values, return true if one is negative and one is positive. 
 * Except if the parameter "negative" is true, then return true only if both are negative. 
 * 
 * posNeg(1, -1, false) true
 * posNeg(-1, 1, false) true
 * posNeg(-4, -5, true) true
 *
 */

public class PosNeg {

	public static void main(String[] args) {

		int number1 = -10;
		int number2 = -5;
		boolean isNegative = false;
		
		System.out.println("functionPosNeg: " + functionPosNeg(number1, number2, isNegative));
	}
	
	public static boolean functionPosNeg(int number1, int number2, boolean isNegative) {

		if (isNegative == true) {
			if (number1 < 0 && number2 < 0) {
				return true;	
			}
			else {
				return false;
			}
		}
		else {
			if ((number1 > 0 && number2 < 0) || (number1 < 0 && number2 > 0)) {
				return true;
			}
			else {
				return false;
			}
		}	
	}
}