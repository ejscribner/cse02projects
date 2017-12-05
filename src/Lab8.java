/*
    Created By: Elliot J Scribner on 11/9/17
    Student ID: ejs320
    Lab #: 8
    Lab8: Generates a random array and calculates range, mean, and standard deviation
 */
import java.util.Arrays;

public class Lab8 {
    public static void main(String[] args) {
        int rand = ((int)(Math.random() * (15-9)+1) + 9); //Generate random length for array
        int[] myArray = new int[rand]; //create array
        for(int i = 0; i < myArray.length; i++) { //assign random digit to array values
            myArray[i] = ((int)(Math.random() * 15-0) + 1);
        }
        //Print and call each value
        System.out.print("My random array is: ");
        print(myArray);
        int myRange = getRange(myArray);
        System.out.print("Range: ");
        print(myRange);
        double myMean = getMean(myArray);
        System.out.print("Mean: ");
        print(myMean);
        double myStdDev = getStdDev(myArray, myMean);
        System.out.print("Standard Deviation: ");
        print(myStdDev);
        double myVariance = getVariance(myArray, myMean);
        System.out.print("Variance: ");
        print(myVariance);

    }
    //Get range of array
    public static int getRange(int[] array) {
        int arrayLength = array.length;
        Arrays.sort(array); //sorts array
        int range = array[arrayLength-1]-array[0];
        return range;
    }
    //Get mean of array
    public static double getMean(int[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {//sum all array elements
            sum += array[i];
        }
        double mean = sum/array.length;
        mean = Math.round(mean*100.00)/100.00;
        return mean;
    }
    //Get standard deviation of array
    public static double getStdDev(int[] array, double mean) {
        double[] newArray = new double[array.length];
        double varianceSum = 0;
        double variance;
        double stdDev;
        for(int i = 0; i < array.length; i++) { //assigns new array of values minus mean
            newArray[i] = array[i] - mean;
        }
        for(int j = 0; j < array.length; j++) { //sums new values squared
            varianceSum += Math.pow(newArray[j],2);
        }
        variance = varianceSum/(array.length-1); //calculates variance
        stdDev = Math.sqrt(variance); //takes the square root of variance
        stdDev = Math.round(stdDev*100.00)/100.00; //rounds to two decimal places
        return stdDev;
    }
    //Get variance of array
    public static double getVariance(int[] array, double mean) {
        double[] newArray = new double[array.length];
        double varianceSum = 0;
        double variance;
        for(int i = 0; i < array.length; i++) { //assigns new array of values minus mean
            newArray[i] = array[i] - mean;
        }
        for(int j = 0; j < array.length; j++) { //sums new values squared
            varianceSum += Math.pow(newArray[j],2);
        }
        variance = varianceSum/(array.length-1); //calculates variance
        variance = Math.round(variance*100.00)/100.00; //rounds to two decimal places
        return variance;
    }
    //print methods
    public static void print(double printValue) {
        System.out.println(printValue);
    }
    public static void print(int printValue) {
        System.out.println(printValue);
    }
    public static void print(int[] printArray) {
        System.out.println(Arrays.toString(printArray));
    }
}
