
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
    public static void main(String[] args) {
        int Counter = 0;
        boolean Boy = false;
        boolean Girl = false;


        while (!(Boy && Girl)) {
            boolean girl = Math.random() < 0.5;
            Counter+=1;
            if (girl) {
                System.out.print("g ");
                Boy = true;
            } else {
                System.out.print("b ");
                Girl = true;
            }
        }
        System.out.println("\nYou made it... and you now have " + Counter + " children.");
    }
}


