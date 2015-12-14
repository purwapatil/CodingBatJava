package codingbatjava;

/**
 * Given a string and a non-negative integer n, we'll say that the front of the string is the first 3 chars, 
 * or whatever is there if the string is less than length 3. Return n copies of the front; 
 * 
 * frontTimes("Chocolate", 2) "ChoCho"
 * frontTimes("Chocolate", 3) "ChoChoCho"
 * frontTimes("Abc", 3) "AbcAbcAbc"
 * 
 */

public class FrontTimes {

	public static void main(String[] args) {
		
		String name = "Chocolate";
		int count = 2;

		System.out.println("functionFrontTimes: " + functionFrontTimes(name, count));
	}
	
	public static String functionFrontTimes(String name, int count) {
		StringBuilder nameCount = new StringBuilder();
		String front = "";
		
		if (name.length() >= 3) {
			front = name.substring(0, 3);	
		}
		
		else {
			front = name;
		}
		
		while(count > 0) {
			nameCount = nameCount.append(front);
			count--;
		}
		
		return nameCount.toString();
	}
}