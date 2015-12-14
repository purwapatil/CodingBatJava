package codingbatjava;

/**
 * Given 2 integers, a and b, return their sum. 
 * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20. 
 * 
 * sortaSum(3, 4) 7
 * sortaSum(9, 4) 20
 * sortaSum(10, 11) 21
 * 
 */

public class SortaSum {

	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		
		System.out.println("functionSortaSum: " + functionSortaSum(a, b));
	}
	
	public static int functionSortaSum(int a, int b) {
		int sum;
		sum = a + b;
		
		if (sum >= 10 && sum <= 19) {
			return 20;
		}
		else {
			return sum;
		}
	}
}