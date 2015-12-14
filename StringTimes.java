package codingbatjava;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string. 
 * 
 * stringTimes("Hi", 2) "HiHi"
 * stringTimes("Hi", 3) "HiHiHi"
 * stringTimes("Hi", 1) "Hi"
 * 
 */

public class StringTimes {

	public static void main(String[] args) {

		String name = "Hi";
		int count = 3;
		
		System.out.println("functionStringTimes: " + functionStringTimes(name, count));
	}
	
	public static String functionStringTimes(String name, int count) {
		
		StringBuilder nameCount = new StringBuilder();
		
		while (count > 0) {
		
		nameCount.append(name);
		count--;
		}
		
		return nameCount.toString();
	}
}