/*
    Created By: Elliot J Scribner on 10/16/17
    Student ID: ejs320
    HW #: 6
    ConvPhoneNum: Converts alphanumeric phone numbers to numbers (with methods)
 */

import java.util.Scanner;

public class ConvPhoneNum {
    public static void main(String[] args) {
        //get user input
        String alphaNum = getInput();
        //convert alphanumeric phone number to numberic phone number
        String numNum = convertToDigit(alphaNum);
        //Output numeric phone number
        printPhone(numNum);
    }

    public static String getInput()  {
        //check if formatting is correct for input number
        boolean isFormatted;
        String alphaNum; //define variable for phone number input
        Scanner input = new Scanner(System.in); //create scanner
        do {
            System.out.print("Please enter an alphanumeric phone number in the format XXX-XXX-XXXX: ");
            alphaNum = input.nextLine(); //get user input
            alphaNum = alphaNum.toUpperCase();
            if (alphaNum.charAt(3) == '-' && alphaNum.charAt(7) == '-' && alphaNum.length() == 12) {
                isFormatted = true;
            } else {
                isFormatted= false;
            }
        } while (!isFormatted);
        return alphaNum;
    }

    public static String convertToDigit(String alphaNum) {
        String numNum = alphaNum;
        for (int i = 0; i < numNum.length(); i++) { //check each number and print corresponding numeric value
            char currentChar = numNum.charAt(i);
            switch (numNum.charAt(i)) {
                case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0': numNum.replace(currentChar, '1'); break;
                case 'A': case 'B': case 'C': numNum = numNum.replace(currentChar, '2'); break;
                case 'D': case 'E': case 'F': numNum = numNum.replace(currentChar, '3'); break;
                case 'G': case 'H': case 'I': numNum = numNum.replace(currentChar, '4'); break;
                case 'J': case 'K': case 'L': numNum = numNum.replace(currentChar, '5'); break;
                case 'M': case 'N': case 'O': numNum = numNum.replace(currentChar, '6'); break;
                case 'P': case 'Q': case 'R': numNum = numNum.replace(currentChar, '7'); break;
                case 'T': case 'U': case 'V': numNum = numNum.replace(currentChar, '8'); break;
                case 'W': case 'X': case 'Y': case 'Z': numNum.replace(currentChar, '9'); break;
            }
        }
        return numNum;
    }

    public static void printPhone(String numNum) {
        System.out.println("Numeric equivalent of the phone number that you entered: " + numNum);
    }
}
