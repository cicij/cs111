

/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: "Cecilia Jiang"
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    boolean numCheck;
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    int num4 = Integer.parseInt(args[3]);
	
    numCheck = (num4 > num3 && num3> num2 && num2 > num1) || (num1 > num2 && num2 > num3 && num3 > num4);
    System.out.println(numCheck);
    }
}
