package five_numbers;

//import java.util.Collections; // import the Collections class
//import java.util.ArrayList; // import the ArrayList class
import java.util.*;

public class FiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Declare variables
		 */
		String validInput;
		int uNumber = 0;
		int spTotal = 0;
		int sCounter = 0;
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * Number Input
		 */
		System.out.println("Please Enter 5 numbers");

		/*
		 * Input validation for number
		 */
		validInput = "invalid";

		while (!validInput.equalsIgnoreCase("valid")) {

			try {
				validInput = "valid";
				uNumber = input.nextInt();
			} catch (java.util.InputMismatchException e) {
				validInput = "invalid";
				System.out.println("Please enter a valid input. Numbers Only.");
				input.nextLine();
			}
			
			if(String.valueOf(uNumber).length() != 5) {
				System.out.println("Please enter 5 numbers");
				validInput = "invalid";
			}

		}
		
		input.close();
		
		/*
		 * Number adder
		 */
		ArrayList<Integer> fiveNum = new ArrayList<Integer>();
		fiveNum.add((uNumber/10000)%10);
		fiveNum.add((uNumber/1000)%10);
		fiveNum.add((uNumber/100)%10);
		fiveNum.add((uNumber/10)%10);
		fiveNum.add(uNumber%10);

	    // Collections.sort(zipcode);
	    
	    /*
	     * Output Constructor
	     */
	    String sPhrase = "The sum of the digits is ";

	    for (int i : fiveNum) { // Forgot i is value from array, no counter.
	    	sCounter++;
	    	sPhrase += i; // Sentence
	    	if (sCounter < 5) {
	    		sPhrase += " + "; 
	    	} else {
	    		sPhrase += " = ";
	    	}
	    	spTotal += i; // Total Value
	    }
	    
	    /*
	     * Constructor Output
	     */
	    System.out.println(sPhrase + spTotal);

	}

}

/*
 * Find length of integer
 * https://www.baeldung.com/java-number-of-digits-in-int
 * 
 * Limit input characters
 * http://www.javaprogrammingforums.com/whats-wrong-my-code/35668-how-limit-users-enter-only-12-digit-input-integer-value-java.html
 * 
 * Array list
 * arrays in Java are static, the ArrayList must be imported to use dynamic arrays
 * https://stackoverflow.com/questions/8452672/java-howto-arraylist-push-pop-shift-and-unshift/16163302
 * https://www.w3schools.com/java/java_arraylist.asp 
 * 
 * Sorting strings
 * originally i was going to sort the user input but directions show input is not sorted
 * https://www.w3schools.com/java/java_arraylist.asp
 * https://www.geeksforgeeks.org/collections-sort-java-examples/
 * 
 * Array size / length
 * needed to find size of array for output construction
 * http://www.java67.com/2016/07/how-to-find-length-size-of-arraylist-in-java.html
 */
