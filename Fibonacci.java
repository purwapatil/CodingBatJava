package codingbatjava;

/**
 * The fibonacci sequence is a famous bit of mathematics, 
 * and it happens to have a recursive definition. 
 * The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
 * Each subsequent value is the sum of the previous two values, 
 * so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
 * Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
 * with n=0 representing the start of the sequence. 
 * 
 * fibonacci(0) 0
 * fibonacci(1) 1
 * fibonacci(2) 1
 * 
 */

public class Fibonacci {

	public static void main(String[] args) {

		int number = 3;
		
		System.out.println("functionFibonacci: " + functionFibonacci(number));
	}
	
	public static int functionFibonacci(int number) {
		
		if (number == 0) {
			return 0;
		}
		else if (number == 1 || number == 2) {
			return 1;
		}
		
		else {
			
			return functionFibonacci(number - 1) + functionFibonacci(number - 2);
		}
	}
}