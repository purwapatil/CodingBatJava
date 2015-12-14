package codingbatjava;

/**
 * We have a loud talking parrot. 
 * The "hour" parameter is the current hour time in the range 0..23. 
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
 * Return true if we are in trouble. 
 * 
 * parrotTrouble(true, 6) true
 * parrotTrouble(true, 7) false
 * parrotTrouble(false, 6) false
 * 
 */

public class ParrotTrouble {

	public static void main(String[] args) {

		int hour = 10; // between 0 to 23
		boolean parrotTalking = true;
		
		System.out.println("functionParrotTrouble: " + functionParrotTrouble(hour, parrotTalking));
	}

	public static boolean functionParrotTrouble(int hour, boolean parrotTalking) {
		
		if (parrotTalking == true && (hour < 7 || hour > 20)) {
			return true;
		}
		
		else {
			return false;
		}
	}
}