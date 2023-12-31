import java.util.Random;

/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 *  that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);
        int totalchild = 0;
        int twochildren = 0;
        int treechildren = 0;
        int morechildren = 0;
        String most_common = "";

        for (int i = 0; i < T; i++) {
            int Counter = 0;
            boolean Boy = false;
            boolean Girl = false;

            while (!(Boy && Girl)) {
                boolean girl = generator.nextDouble() < 0.5;
                Counter += 1;
                if (girl) {
                    Boy = true;
                } else {
                    Girl = true;
                }
            }
            totalchild += Counter;
            if (Counter == 2) {
                twochildren += 1;
            } else if (Counter == 3) {
                treechildren += 1;
            } else {
                morechildren += 1;
            }
        }

        double average = (double) totalchild / T;
        int max = twochildren;
        most_common = "2";

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
        System.out.println("The most common number of children is " + most_common + ".");
    }
  
}		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    

