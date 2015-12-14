package codingbatjava;

import java.util.Scanner;

/**
 * We want to make a row of bricks that is goal inches long. 
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
 * Return true if it is possible to make the goal by choosing from the given bricks. 
 *  
 *  makeBricks(3, 1, 8) true
 *  makeBricks(3, 1, 9) false
 *  makeBricks(3, 2, 10) true
 * 
 */

public class MakeBricks {

	public static void main(String[] args) {

		// declare variables
		int small;
		int big;
		int goal;

		// take user input
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of small bricks: ");
		small = s.nextInt();

		System.out.println("Enter number of big bricks: ");
		big = s.nextInt();

		System.out.println("Enter the goal: ");
		goal = s.nextInt();

		s.close();

		// call make bricks function
		System.out.println("functionMakeBricks: " + functionMakeBricks(small, big, goal));
	}
	
	public static boolean functionMakeBricks(int small, int big, int goal) {
		
		if (big > 0) {
			if (goal > big * 5 + small) {
				return false;
			}
			
			if (goal % 5 <= small) {
				return true;
			}
		}
		
		else if (big == 0) {
			if (goal <= small) {
			return true;
			}
		}
		
		return false;
	}
}