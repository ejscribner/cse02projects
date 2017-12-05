/*
    Created By: Elliot J Scribner on Sep 30 2017
    Student ID: ejs320
    Homework #: 4 Part 1
    AccountBalance: Calculates a 5% interest over 6 months on an input monthly deposit
 */

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        //Inputs and variable declarations
        Scanner input = new Scanner(System.in);
        double monthlyDeposit; //monthly deposit amount (defined by user)
        double myBalance = 0; //current balance in account
        System.out.println("Enter the monthly saving amount:");
        monthlyDeposit = input.nextDouble();

        //Iterate + calculate interest
        for (int i = 0; i < 6; i++) {
            myBalance = (monthlyDeposit + myBalance) * (1 + 0.00417);
        }

        //round balance and print
        myBalance = Math.round(myBalance*100.0)/100.0;
        System.out.println("After the sixth month, the account value is: $"+ myBalance);
    }
}
