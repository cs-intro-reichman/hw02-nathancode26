/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		int len = args[0].length() - 1;
		int middle =len/2;
		char mid =  args[0].charAt(middle);
		String new_word = " "; 
		while ( len >= 0) {
			new_word += args[0].charAt(len);
			len -= 1;
		}
		System.out.println(new_word);
		System.out.println("The middle character is " + mid);
	}
}
