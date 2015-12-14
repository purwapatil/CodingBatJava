package codingbatjava;

/**
 * Given 2 integers, a and b, return true if one if them is 10 or if their sum is 10. 
 * 
 * makes10(9, 10) true
 * makes10(9, 9) false
 * makes10(1, 9) true
 * 
 */

public class Makes10 {

	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		
		System.out.println("functionMakes10: " + functionMakes10(a,b));
	}

	public static boolean functionMakes10(int a, int b) {
		
		if (a == 10 || b == 10 || (a+b) == 10) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
