/*
    Created By: Elliot J Scribner on 10/12/17
    Student ID: ejs320
    Lab #: 6
    ParseString: Counts number of each type of character and prints it
 */

import java.util.Scanner;

public class ParseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create scanner
        //define string and length variables
        String myString;
        int myStringLength;
        //gather string input and check if empty
        boolean isValidInput;
        do {
            System.out.println("Please type a string with lowercase letters, uppercase letters, numerical digits, and any of the special characters (#,*,$,&");
            myString = input.nextLine();
            myStringLength = myString.length();
            if (myStringLength == 0) {
                isValidInput = false;
            } else {
                isValidInput = true;
            }
        } while (!isValidInput);
        //print string name
        System.out.println("The string " + myString + " has: ");
        //call different counter methods
        int numLowerCase = countLowerCase(myString, myStringLength);
        int numUpperCase = countUpperCase(myString, myStringLength);
        int numDigits = countDigit(myString, myStringLength);
        int numSpecialChar = countSpecialChar(myString, myStringLength);
        //print different values for counts using printMsg method
        printMsg(numLowerCase + " lowercase letter(s)");
        printMsg(numUpperCase + " uppercase letter(s)");
        printMsg(numDigits + " digit(s)");
        printMsg(numSpecialChar + " special character(s)");
    }
    //count lower case characters
    public static int countLowerCase(String stringInput, int stringLength) {
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            char currentChar = stringInput.charAt(i);
            if(Character.isLowerCase(currentChar)) {
                count = count + 1;
            } else {
                continue;
            }
        }
        return count;
    }
    //count upper case characters
    public static int countUpperCase(String stringInput, int stringLength) {
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            char currentChar = stringInput.charAt(i);
            if(Character.isUpperCase(currentChar)) {
                count = count + 1;
            } else {
                continue;
            }
        }
        return count;
    }
    //count digits
    public static int countDigit(String stringInput, int stringLength) {
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            char currentChar = stringInput.charAt(i);
            if(Character.isDigit(currentChar)) {
                count = count + 1;
            } else {
                continue;
            }
        }
        return count;
    }
    //count special characters
    public static int countSpecialChar(String stringInput, int stringLength) {
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            char currentChar = stringInput.charAt(i);
            if(currentChar == '#' || currentChar == '*' || currentChar == '$' || currentChar == '&') {
                count = count + 1;
            } else {
                continue;
            }
        }
        return count;
    }
    //print values
    public static void printMsg(String myPrint) {
        System.out.println(myPrint);
    }
}
