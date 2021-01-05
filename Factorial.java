/*
* This program shows the user the factorial of an integer entered by the user.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2021-01-05
*/

import java.util.Scanner;  // Import the Scanner class

public class Factorial {
  /**
   * This function finds the factorial of a number passed into the function and
   * returns it.
   */
  static int findFactorial(int userInteger) {
    // Checking if the number can have a factorial (integer greater than 0)
    if (userInteger > 0) {
      // If statement that checks if the integer passed in is equal to 1
      if (userInteger == 1) {
        // Returning 1
        return 1;
      } else {
        // Using recursion to solve for the factorial of the inputted integer
        int factorial = userInteger * findFactorial(userInteger - 1);
        return factorial;
      }
    } else {
      // Throwing error such that number entered cannot have a factorial
      throw null;
    }
  }

  /**
   * This function allows the user to enter an integer and the program will show
   * the user the factorial of that integer.
   */
  public static void main(String[] args) {
    try {
      // Creating a scanner object to receive the user's integer input
      final Scanner numberInput = new Scanner(System.in);

      // User input for the integer
      System.out.print("Enter an integer you want the factorial of: ");
      int userNumber = numberInput.nextInt();

      // Calling the function that will find the factorial of the inputted integer
      int userFactorial = findFactorial(userNumber);

      // Returning the factorial of the inputted number to the user
      System.out.println("");
      System.out.print("The factorial of your number is: " + userFactorial);

      // Catches and tells the user what error occurred
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Unable to find factorial of given integer");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("ERROR: Invalid Input");
    }
  }
}
