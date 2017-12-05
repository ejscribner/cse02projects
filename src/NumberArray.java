/*
    Created By: Elliot J Scribner on 11/4/17
    Student ID: ejs320
    Hw #: 8
    NumberArray: Creates array of random values and calculates metrics
 */

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] myArray = new int[15];

        for(int i = 0; i < 15; i++) {
            myArray[i] = ((int)(Math.random() * 100-0) + 1);
        }

        int total = 0;
        for(int j = 0; j < 15; j++) {
            total = total + myArray[j];
        }
        int average = total/15;
        System.out.println("The average of the numbers in the array is: " + average);

        int countGreater = 0;
        int countLower = 0;

        for (int k = 0; k < 15; k++) {
            int currVal = myArray[k];
            if(currVal > average) {
                countGreater++;
            }
            if(currVal < average) {
                countLower++;
            }
        }

        System.out.println("There are " + countGreater + " numbers higher than the average and " + countLower + " numbers lower than the average.");
        int[] oddNumbers = oddNumArray(myArray);
        int[] evenNumbers = evenNumArray(myArray);
        System.out.print("The original array is: ");
        System.out.println(Arrays.toString(myArray));
        System.out.print("The odd numbers in the array are: ");
        System.out.println(Arrays.toString(oddNumbers));
        System.out.print("The even numbers in the array are: ");
        System.out.println(Arrays.toString(evenNumbers));



    }

    public static int[] oddNumArray(int[] values) {
        int counter = 0;
        for(int i = 0; i < 15; i++) {
            int currVal = values[i];
            if(currVal % 2 != 0) {
                counter++;
            }
        }

        int[] oddNums = new int[counter];
        int k = 0;
        for(int j = 0; j < 15; j++) {
            int currVal = values[j];
            if(currVal % 2 != 0) {
                oddNums[k] = currVal;
                k++;
            }
        }
        return oddNums;
    }

    public static int[] evenNumArray(int[] values) {
        int counter = 0;
        for(int i = 0; i < 15; i++) {
            int currVal = values[i];
            if(currVal % 2 == 0) {
                counter++;
            }
        }

        int[] evenNums = new int[counter];
        int f = 0;
        for(int i = 0; i < 15; i++) {
            int currVal = values[i];
            if(currVal % 2 == 0) {
                evenNums[f] = currVal;
                f++;
            }
        }
        return evenNums;
    }
}
