/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		for(int i=0 ; i< n-1  ; i++ ){
			int c =n;
			if(i % 2 == 0){
				System.out.print("*");
			} 
			else{
				System.out.print(" *");
			}
			for(int k = 0  ; k< c ; k++){
				System.out.print(" " + "*");
			}
			System.out.println();
		}
		
	}
}
