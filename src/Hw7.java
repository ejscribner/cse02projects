/*
    Created By: Elliot J Scribner on 10/30/17
    Student ID: ejs320
    HW #: 7
    Hw7: Collects information from a user through overloaded methods
 */

import java.util.Scanner;


public class Hw7 {
    //Main Class
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in); //create scanner
        int n;
        n = getInt(scan); //call first version of the method
        System.out.println("You entered "+n); //print out number entered if it matches parameters
        n = getInt(scan,6,true); //call second version of the method
        System.out.println("You entered "+n);
        n = getInt(scan,15,false); //call second version of the method
        System.out.println("You entered "+n);
        n = getInt(scan,12,18); //call third version of the method
        System.out.println("You entered "+n);
        n = getInt(scan,22,18); //call third version of the method
        System.out.println("You entered "+n);
    }

    //first version of method, accepts any int
    public static int getInt(Scanner scan) {
        int returnVal = 0;
        System.out.print("Enter an int: ");
            while (!scan.hasNextInt()) {
                System.out.print("Invalid input, please enter an int: ");
                scan.next();
            }
        returnVal = scan.nextInt();
        return returnVal;
    }

    //second version of method, accepts int greater than or less than a bound (inclusive)
    public static int getInt(Scanner scan, int bound, boolean isGreaterThan) {
        int returnVal = 0;
        if (isGreaterThan) {
            do {
                System.out.print("Enter an int greater than or equal to " + bound + ": ");
                while (!scan.hasNextInt()) {
                    System.out.print("Invalid input, please enter an int: ");
                    scan.next();
                }
                returnVal = scan.nextInt();
            } while (returnVal < bound);
        } else if (!isGreaterThan) {
            do {
                System.out.print("Enter an int less than or equal to " + bound + ": ");
                while (!scan.hasNextInt()) {
                    System.out.print("Invalid input, please enter an int: ");
                    scan.next();
                }
                returnVal = scan.nextInt();
            } while (returnVal >= bound);
        }
        return returnVal;
    }

    //third version of method, accepts int between two bounds
    public static int getInt(Scanner scan, int bound1, int bound2) {
        int returnVal = 0;
        if (bound1 > bound2) {
            do {
                System.out.print("Enter an int between " + bound2 + " and " + bound1 + ", inclusive: ");
                while (!scan.hasNextInt()) {
                    System.out.print("Invalid input, please enter an int: ");
                    scan.next();
                }
                returnVal = scan.nextInt();
            } while (returnVal >= bound1 && returnVal <= bound2);
        } else if (bound2 > bound1) {
            do {
                System.out.print("Enter an int between " + bound1 + " and " + bound2 + ", inclusive: ");
                while (!scan.hasNextInt()) {
                    System.out.print("Invalid input, please enter an int: ");
                    scan.next();
                }
                returnVal = scan.nextInt();
            } while (returnVal <= bound1 && returnVal >= bound2);
        }
        return returnVal;
    }
}
