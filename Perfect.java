/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		String txt = args[0] + " is a perfect number since " + args[0] + " = 1";
		int k = 2;
		int counter = 1;
		int number = Integer.parseInt(args[0]);
		while ( k < number) {
			if ((number % k)==0) {
				txt = txt + " + " + k;
				counter+=k;
			}
			k+=1;
		}
		if(counter==number){
			System.out.println(txt);
		}
		else{
			System.out.println(number + " is not a perfect number");
		}
	}
}
