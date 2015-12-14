package codingbatjava;

/**
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". 
 * 
 * helloName("Bob") "Hello Bob!"
 * helloName("Alice") "Hello Alice!"
 * helloName("X") "Hello X!"
 * 
 */

public class HelloName {

	public static void main(String[] args) {
		
		String name = "Test";

		System.out.println("functionHelloName: " + functionHelloName(name));
	}
	
	public static String functionHelloName(String name) {
		
		return "Hello " + name + "!";
		
	}
}