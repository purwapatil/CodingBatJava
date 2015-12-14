package codingbatjava;

/**
 * You and your date are trying to get a table at a restaurant. 
 * The parameter "you" is the stylishness of your clothes, in the range 0..10, 
 * and "date" is the stylishness of your date's clothes. 
 * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
 * If either of you is very stylish, 8 or more, then the result is 2 (yes). 
 * With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
 * Otherwise the result is 1 (maybe). 
 * 
 * dateFashion(5, 10) 2
 * dateFashion(5, 2) 0
 * dateFashion(5, 5) 1
 * 
 */

public class DateFashion {

	public static void main(String[] args) {

		int youStyle = 5;
		int dateStyle = 5;
		
		System.out.println("functionDateFashion: " + functionDateFashion(youStyle, dateStyle));
	}
	
	public static int functionDateFashion(int youStyle, int dateStyle) {
		
		if ((youStyle >= 8 || dateStyle >= 8) && youStyle > 2 && dateStyle >2) {
			return 2;
		}
		
		else if (youStyle <= 2 || dateStyle <= 2) {
			return 0;
		}
		else {
			return 1;
		}
	}
}