/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T =Integer.parseInt(args[0]);
		String most_common = "";
		double average = 0.0;
		int totalchild = 0;
		int twochildren = 0;
		int treechildren = 0;
		int morechildren = 0 ;
		for(int i=0;i<=T-1;i++){
			int Counter = 0;
        	boolean Boy = false;
        	boolean Girl = false;
       		while (!(Boy && Girl)) {
            	boolean girl = Math.random() < 0.5;
            	Counter+=1;
            	if (girl) {
               		 Boy = true;
            	} 
				else {
                	Girl = true;
            	}
			}
			totalchild+=Counter;
			if (Counter==2){
				twochildren+=1;
			}
			else if (Counter==3) {
				treechildren+=1;	
			}
			else{
				morechildren+=1;
			}
		}
		average = (double)totalchild/T;
		int max = twochildren;
		most_common="2";
		if (treechildren > max) {
			max = treechildren;
			most_common = "3";		
		}
		if (morechildren > max) {
			max = morechildren;
			most_common = "4 or more";
		}
		System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twochildren);
        System.out.println("Number of families with 3 children: " + treechildren);
        System.out.println("Number of families with 4 or more children: " + morechildren);
		System.out.println("The most common number of children is " + most_common );

	}	
}
