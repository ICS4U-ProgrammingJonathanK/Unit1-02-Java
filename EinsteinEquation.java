/* The Einstein Equation  program implements an application that

* Asks the user for the mass of the object and calculates the amount

* Of joules that would be released.

*

* @author  Jonathan Kene

* @version 1.0

* @since   2022-02-22

*/

import java.util.Scanner;

class EinsteinEquation {
    public static void main(String[] args) {
        double speedOfLight = (Math.pow(2.998 * 10, 8));
        double power = 2;

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the mass of an object: ");
        double mass = input.nextDouble();
        double energy = mass * (Math.pow(speedOfLight, power));
        System.out.println(energy + " joules of energy could be released from that object.");

    input.close();
  } 
}
