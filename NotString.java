package codingbatjava;

/**
 * Given a string, return a new string where "not " has been added to the front. 
 * However, if the string already begins with "not", return the string unchanged. 
 *  
 *  notString("candy") "not candy"
 *  notString("x") "not x"
 *  notString("not bad") "not bad"
 * 
 */

public class NotString {

	public static void main(String[] args) {

		String test = "not test";
		
		System.out.println("functionNotString: " + functionNotString(test));
	}
	
	public static String functionNotString(String test) {
		
		if (test.startsWith("not")) {
			return test;
		}
		
		else {
			return "not " + test;
		}
	}
}