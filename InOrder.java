/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int prevNumber = 0;
        int currentNumber = (int) (Math.random() * 10);
        
        do {
            System.out.print(" " + currentNumber);
            prevNumber= currentNumber;
            currentNumber = (int) (Math.random() * 10);
        } while (currentNumber >= prevNumber);
	}
}
