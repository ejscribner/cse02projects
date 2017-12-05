/*
    Created By: Elliot J Scribner on 9/30/17
    Student ID: ejs320
    Homework #: 4 Part 2
    Lottery: Creates random lottery number and compares it with the entered value to see how much money is won
 */

import java.util.Scanner;
import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //generate random number
        int lotteryNum = ((int)(Math.random() * 900) + 100); //randomly generated lottery number
        String lotteryNumString = Integer.toString(lotteryNum); //lottery number converted to string

        //create substrings of each digit
        String lotteryNum1 = lotteryNumString.substring(0,1); //first digit
        String lotteryNum2 = lotteryNumString.substring(1,2); //second digit
        String lotteryNum3 = lotteryNumString.substring(2,3); //third digit

        //store substring digits in an array and sort
        int[] lotteryNumArr = {Integer.parseInt(lotteryNum1), Integer.parseInt(lotteryNum2), Integer.parseInt(lotteryNum3)};
        Arrays.sort(lotteryNumArr);

        //take user input number
        System.out.println("Enter a three digit number: ");
        int myNum = input.nextInt(); //user input number
        String myNumString = Integer.toString(myNum); //user input number converted to string

        //check if string has leading 0 or is only 2 digits and fix the error
        if (myNumString.length() == 2) {
            myNumString = '0' + myNumString;
        }

        //check if the string has two leading 0's or is only 1 digit and fix the error
        if (myNumString.length() == 1) {
            myNumString = '0' + '0' + myNumString;
        }

        //create substring digits of each digit
        String myNum1 = myNumString.substring(0,1); //first digit
        String myNum2 = myNumString.substring(1,2); //second digit
        String myNum3 = myNumString.substring(2,3); //third digit

        //store substring digits in an array and sort
        int[] myNumArr = {Integer.parseInt(myNum1), Integer.parseInt(myNum2), Integer.parseInt(myNum3)};
        Arrays.sort(myNumArr);

        //check if original numbers are exactly the same
        if (lotteryNumString.equals(myNumString)) {
            System.out.println("Congratulations! You won $10,000.The winning lottery number is: "+ lotteryNumString);
            return;
        }

        //check if ALL of the numbers are the same but in a different order
        if (lotteryNumArr[0] == myNumArr[0] && lotteryNumArr[1] == myNumArr[1] && lotteryNumArr[2] == myNumArr[2]) {
            System.out.println("Congratulations! You won $3,000.The winning lottery number is: "+ lotteryNumString);
            return;
        }

        //check if ONE of the numbers is the same in any order
        Boolean oneDigitEqual = false; //declare boolean to check if final condition is true
        for (int i = 0; i <= 2;) { //double nested for loop to check the first array against the second array efficiently
            for (int j = 0; j <= 2;) {
                if (lotteryNumArr[i] == myNumArr[j]){
                    oneDigitEqual = true; //set true if one of the digits matches
                }
                j++;
            }
            i++;
        }

        //print statements depending on if the final condition is true or false
        if (oneDigitEqual == true) {
            System.out.println("Congratulations! You won $1,000.The winning lottery number is: "+ lotteryNumString);
        } else {
            System.out.println("Sorry! You lose. The winning lottery number is: "+ lotteryNumString);
        }
    }
}
