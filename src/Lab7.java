/*
    Created By: Elliot J Scribner on 11/2/17
    Student ID: ejs320
    Lab #: 7
    Lab7: Generates array with user inputs and finds different values within the array
 */

import java.util.Scanner;
import java.util.Arrays;

public class Lab7 {
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];
        System.out.print("Enter 10 ints: ");
        for(int i = 0; i < 10; i++) {
            myArray[i] = input.nextInt();
        }

        int myMax = max(myArray);
        System.out.println("The highest entry is: " + myMax);
        int myMin = min(myArray);
        System.out.println("The lowest entry is: " + myMin);
        int mySum = sum(myArray);
        System.out.println("The sum is: " + mySum);
        System.out.println("");
        reverse(myArray);

    }
    //max method
    public static int max(int[] array) {
        int max = 0;
        Arrays.sort(array); //sort array
        max = array[9]; //return last value in array (highest)
        return max;
    }
    //min method
    public static int min(int[] array) {
        int min = 0;
        Arrays.sort(array); //sort array
        min = array[0]; //return first value in array (lowest)
        return min;
    }
    //sum method
    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < 10; i++) { //loop to add all array values together
            sum += array[i];
        }
        return sum;
    }
    //reverse method
    public static void reverse(int[] array) {
        int[] flippedArray = new int[10];
        int j = 9;
        for(int i = 0; i < 10; i++) { //reverse order of array
            flippedArray[j] = array[i];
            j = j - 1;
        }


        for (int k = 0; k < 10; k++) { //print out both arrays
            System.out.print(array[k] + "  ");
            System.out.println(flippedArray[k]);
        }
    }
}
