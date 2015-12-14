package codingbatjava;

import java.util.Scanner;

/**
 * Given 3 integer values, a b c, return their sum. 
 * However, if one of the values is the same as another of the values, it does not count towards the sum. 
 * 
 * loneSum(1, 2, 3) 6
 * loneSum(3, 2, 3) 2
 * loneSum(3, 3, 3) 0
 * 
 */

public class LoneSum {

	public static void main(String[] args) {

		int a; 
		int b; 
		int c;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a:");
		a = s.nextInt();
		
		System.out.println("Enter b:");
		b = s.nextInt();
		
		System.out.println("Enter c:");
		c = s.nextInt();
		
		s.close();
		
		System.out.println("functionLoneSum: " + functionLoneSum(a, b, c));
	}
	
	public static int functionLoneSum(int a, int b, int c) {
		int sum = 0;
		
		if (a != b && b != c && a != c) {
			sum = a + b + c;
		}
		
		if (a == b && b != c && a != c) {
			sum = c;
		}
		
		if (a != b && b == c && a != c) {
			sum = a;
		}
		
		if (a != b && b != c && a == c) {
			sum = b;
		}
		
		return sum;
	}
}