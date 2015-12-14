package codingbatjava;

/**
 * We have bunnies standing in a line, numbered 1, 2, ... 
 * The odd bunnies (1, 3, ..) have the normal 2 ears. 
 * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. 
 * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication). 
 * 
 * bunnyEars2(0) 0
 * bunnyEars2(1) 2
 * bunnyEars2(2) 5
 * 
 */

public class BunnyEars2 {

	public static void main(String[] args) {

		int bunnies = 2;

		System.out.println("functionBunnyEars2: " + functionBunnyEars2(bunnies));
	}
	
	public static int functionBunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		
		else if (bunnies % 2 == 0) {
			return 3 + functionBunnyEars2(bunnies - 1);
		}
		else {
			return 2 + functionBunnyEars2(bunnies - 1);
		}
	}
}