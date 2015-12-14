package codingbatjava;

/**
 * Return an integer array length 3 containing the first 3 digits of pi, {3, 1, 4} 
 * 
 * makePi() {3, 1, 4}
 * 
 */

public class MakePi {

	public static void main(String[] args) {

		int[] array = new int[3];
		
		array = functionMakePi();
		
		System.out.println("array: " + array[0]);
		System.out.println("array: " + array[1]);
		System.out.println("array: " + array[2]);
	}

	public static int[] functionMakePi() {
		
		int[] array = new int[] {3, 1, 4};
		return array;
	}
}