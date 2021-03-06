import java.util.Scanner;

/**
* The Einstein Equation program implements an application that
* Asks the user for the mass of the object and calculates the amount
* Of joules that would be released.
*
* @author  Jonathan Kene
* @version 1.0
* @since   2022-02-22
*/

final class EinsteinEquation {

    /**
     * Declaring constant.
     */
    private static final double LIGHT_SPEED = 2.998 * (Math.pow(10, 8));
    /**
     * Main entry point into program.
     *
     * @throws IllegalArgumentException To get rid of style error
     * @throws com.myorg.IllegalArgumentException1 To gain access to throw
     */

    private EinsteinEquation() {
        throw new IllegalArgumentException("Utility class");
    }
    /**
     * To get rid of style error.
     *
     * @param args nothing passed in
     *
     */

    public static void main(String[] args) {

        final double power = 2;
        final Scanner myObj = new Scanner(System.in);
        // Create a Scanner object
        System.out.print(" Enter the mass of an object: ");
        final String massAsString = myObj.nextLine();
        final double massAsDouble = -1;
        try {
            massAsDouble = Double.parseDouble(massAsString);
        } catch (IllegalArgumentException exception) {
            System.out.println("Not valid must be a number");
            System.exit(1);
        }
        final double energy = massAsDouble * (Math.pow(LIGHT_SPEED, power));
        System.out.println(energy + " joules of energy could be released from "
            + massAsString + " kg");
        myObj.close();
    }
}
