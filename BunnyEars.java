package codingbatjava;

/**
 * We have a number of bunnies and each bunny has two big floppy ears. 
 * We want to compute the total number of ears across all the bunnies recursively 
 * (without loops or multiplication). 
 * 
 * bunnyEars(0) 0
 * bunnyEars(1) 2
 * bunnyEars(2) 4
 * 
 */

public class BunnyEars {

	public static void main(String[] args) {
		
		int bunnies = 2;

		System.out.println("functionBunnyEars: " + functionBunnyEars(bunnies));
	}
	
	public static int functionBunnyEars(int bunnies) {
		
		
		if (bunnies == 0) {
			return 0;
		}
		
		else {
			return 2 + functionBunnyEars(bunnies - 1);
			
		}
	}
}