package codingbatjava;

/**
 * When squirrels get together for a party, they like to have cigars. 
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
 * Return true if the party with the given values is successful, or false otherwise. 
 * 
 * cigarParty(30, false) false
 * cigarParty(50, false) true
 * cigarParty(70, true) true
 * 
 */

public class CigarParty {

	public static void main(String[] args) {

		int numberCigars = 40;
		boolean isWeekend = true;
		
		System.out.println("functionCigarParty: " + functionCigarParty(numberCigars, isWeekend));
	}

	public static boolean functionCigarParty(int numberCigars, boolean isWeekend) {
		
		if (isWeekend == true && numberCigars >= 40) {
 				return true;
		}
		
		else if (isWeekend == false && numberCigars >= 40 && numberCigars <= 60) {
				return true;
		}
		else {
			return false;
		}
	}
}