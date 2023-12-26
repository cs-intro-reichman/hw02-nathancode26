/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int k =1;
		int number = Integer.parseInt(args[0]);
		while ( k <= number) {
			if ((number % k)==0) {
				System.out.println(k);
			}
			k+=1;		
		}
		
	}
}
