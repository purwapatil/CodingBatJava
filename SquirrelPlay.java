package codingbatjava;

/**
 * The squirrels in Palo Alto spend most of the day playing. 
 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
 * Unless it is summer, then the upper limit is 100 instead of 90. 
 * Given an integer temperature and a boolean isSummer, return true if the squirrels play and false otherwise. 
 * 
 * squirrelPlay(70, false) true
 * squirrelPlay(95, false) false
 * squirrelPlay(95, true) true
 * 
 */

public class SquirrelPlay {

	public static void main(String[] args) {

		int temperature = 50;
		boolean isSummer = true;
		
		System.out.println("functionSquirrelPlay: " + functionSquirrelPlay(temperature, isSummer));
	}
	
	public static boolean functionSquirrelPlay(int temperature, boolean isSummer) {
		if (isSummer == true && temperature >= 60 && temperature <= 100) {
			return true;
		}
		
		if (isSummer == false && temperature >= 60 && temperature <= 90) {
			return true;
		}
		
		else {
			return false;
		}
	}
}