/*
    Created By: Elliot J Scribner on 11/13/17
    Student ID: ejs320
    HW #: 9
    AverageCalories: Creates an array of calories eaten for each meal throughout a week and calculates the average for the week.
 */

import java.util.Arrays;

public class AverageCalories {
    public static void main(String[] args) {
        int[][] myCalories = createArray();
        printArray(myCalories);
        System.out.print("Average calories per meal: ");
        System.out.println(calcAvgCal(myCalories));

    }
    public static int[][] createArray() {
        int[][] calories = new int[7][];
        calories[0] = new int[] {150, 800};
        calories[1] = new int[] {210, 600, 500};
        calories[2] = new int[] {1500};
        calories[3] = new int[] {150, 1500};
        calories[4] = new int[] {300, 500, 1000, 300};
        calories[5] = new int[] {210, 1100};
        calories[6] = new int[] {700, 500, 400};

        return calories;
    }
    public static double calcAvgCal(int[][] calories) {
        int sum = 0;
        int counts = 0;
        for(int i = 0; i < calories.length; i++) {
            for(int j = 0; j < calories[i].length; j++) {
                sum += calories[i][j];
                counts++;
            }
        }
        int avg = sum/counts;
        return avg;
    }
    public static void printArray(int[][] calories) {
        for(int i = 0; i < 7; i++) {
            int day = i+1;
            System.out.print("Day " + day + ": ");
            System.out.println(Arrays.toString(calories[i]));
        }

    }
}
