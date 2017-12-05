/*
    Created By: Elliot J Scribner on 10/5/17
    Student ID: ejs320
    Lab #: 5
    Pyramid: Prints Pyramid pattern of an entered number of lines that counts down by 1 increments
 */

import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Boolean isOutOfRange;
        int numLines;
        do {
            System.out.print("How many lines would you like to print? (Between 2 and 15) ");
            numLines = input.nextInt();
            if (numLines <= 15 && numLines >= 2) {
                isOutOfRange = false;
            } else {
                isOutOfRange = true;
                System.out.print("*Error* Please enter a value between 2 and 15 ");
            }
        } while (isOutOfRange);
        for(int currLine = 0; currLine < numLines; currLine++) {
            int i = numLines - 8;
            for (int j = 0; j < numLines-currLine; j++) {
                if (numLines >= 10) {
                    if (i > 0) {
                        System.out.print("   ");
                        i--;
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = currLine + 1; k >= 1; k--) {
                System.out.print(" "+k);
            }
            for (int l = 2; l <= currLine + 1; l++) {
                System.out.print(" "+l);
            }
            System.out.println(" ");

        }

    }
}
