package temperature;

import java.text.DecimalFormat;
import java.util.*;

public class temp_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Set scanner object
		 */
		Scanner input = new Scanner(System.in);

		/*
		 * Set Variables
		 */
		int i = 1;
		String reRun = null;
		String tConversion;
		String validInput;
		double nConversion = 0.0; // Number

		/*
		 * Main Loop
		 */
		while (i != 0) {

			/*
			 * Conversion Type
			 */
			System.out.println("Temperature Conversion Utility Version 1.0");
			System.out.println("Please enter C for Celcius or F for Fahrenheit to begin conversion");
			tConversion = input.nextLine();

			/*
			 * Input validation for type
			 */
			validInput = "invalid";
			while (!validInput.equalsIgnoreCase("valid")) {

				if (tConversion.equalsIgnoreCase("c")) {
					validInput = "valid";
				} else if (tConversion.equalsIgnoreCase("f")) {
					validInput = "valid";
				} else {
					System.out.println("Please enter a valid input.");
					System.out.println("Celcius or Fahrenheit? C or F");
					tConversion = input.nextLine();
				}

			}

			/*
			 * Temperature Input
			 */
			System.out.println("Please enter a number");

			/*
			 * Input Validation for number
			 */
			validInput = "invalid";

			while (!validInput.equalsIgnoreCase("valid")) {

				try {
					validInput = "valid";
					nConversion = input.nextDouble();
				} catch (java.util.InputMismatchException e) {
					validInput = "invalid";
					System.out.println("Please enter a valid input. Numbers Only.");
					input.nextLine();
				}

			}
			
			/*
			 * Temperature Conversion
			 */
			if (tConversion.equalsIgnoreCase("c")) {
				DecimalFormat df = new DecimalFormat("###.##");
				System.out.println(nConversion + " Celcius is equal to " + df.format(((9.0/5.0) * nConversion + 32)) + " Fahrenheit.");
			}
			
			if (tConversion.equalsIgnoreCase("f")) {
				DecimalFormat df = new DecimalFormat("###.##");
				System.out.println(nConversion + " Fahrenheit is equal to " + df.format(((5.0/9.0) * (nConversion - 32))) + " Celsius.");
			} 

			/*
			 * Check if user want to close the program a validates input
			 */
			System.out.println("Would you like to run the program again? y/n");
			validInput = "invalid";

			while (!validInput.equalsIgnoreCase("valid")) {

				try {
					validInput = "valid";
					reRun = input.nextLine();
				} catch (java.util.InputMismatchException e) {
					validInput = "invalid";
					input.nextLine();
				} finally {
					if (reRun.equalsIgnoreCase("n")) {
						i = 0;
						validInput = "valid";
					} else if (reRun.equalsIgnoreCase("y")) {
						validInput = "valid";
					} else if (!reRun.equalsIgnoreCase("n")) {
						validInput = "invalid";
					} else if (!reRun.equalsIgnoreCase("y")) {
						validInput = "invalid";
					} else if (validInput == "invalid"){
						System.out.println("Please enter a valid input.");
						System.out.println("Would you like to run the program again? y/n");
						reRun = input.nextLine();
					}
				}

			}

			/*
			 * Notes
			 * 
			 * Comparison of scanner object values
			 * https://stackoverflow.com/questions/34728988/how-to-compare-string-in-java-
			 * using-scanner-object
			 * 
			 * Comparison of scanner object values
			 * https://www.journaldev.com/18009/java-string-compare#java-string-compare-
			 * using-equals-method
			 * 
			 * Comparison of scanner object values
			 * https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
			 *
			 * Comparing strings was something new, Didn't know a method needed to be called
			 * on the scanner object
			 * 
			 * Scanner input types 
			 * https://www.w3schools.com/java/java_user_input.asp
			 * 
			 * Dealing with exceptions from scanner input
			 * https://stackoverflow.com/questions/24414299/java-scanner-exception-handling
			 * 
			 * Try and Catch
			 * https://www.w3schools.com/java/java_try_catch.asp
			 * 
			 * Rounding doubles and floats
			 * https://www.baeldung.com/java-round-decimal-number
			 */

		}
		input.close();
	}
}

/*
 * Closing notes
 * 
 * For some reason "Would you like to run the program again? y/n" is showing up
 * twice in the console need to find reason and finish assignment.
 * 
 * resolution
 * was asking for input and immediately after try was checking if input was valid without waiting for input.
 */
