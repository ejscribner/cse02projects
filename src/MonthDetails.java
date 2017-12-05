/*
    Created By: Elliot J Scribner on Sep 19 2017
    Student ID: ejs320
    HW #: 3
    MonthDetails: Takes an integer and returns the month name, number of days, and season
 */

import java.util.Scanner;

public class MonthDetails {
    public static void main(String[] args) {
        //create scanner input
        Scanner input = new Scanner(System.in);

        //initialize all variables
        int yearNum = 0;
        int monthDays;
        String monthSuffix;
        String monthName;
        String season;

        //input month number
        System.out.println("Enter an integer giving the number of the month (1-12): ");
        int monthNum = input.nextInt();

        //check valid month & return to main if invalid
        if (monthNum > 12) {
            System.out.println("You did not enter an integer between 1 and 12");
            main(null);
        }

        //prompt for year to check days in february for leap year
        if (monthNum == 2) {
            System.out.println("Enter an integer giving the year: ");
            yearNum = input.nextInt();
        }

        //determine month suffix
        if (monthNum == 1) {
            monthSuffix = "st";
        } else if (monthNum == 2) {
            monthSuffix = "nd";
        } else if (monthNum == 3) {
            monthSuffix = "rd";
        } else {
            monthSuffix = "th";
        }

        //determine month name from number
        switch(monthNum) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid";
                break;
        }

        //determine number of days in the month
        switch (monthNum) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                monthDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                monthDays = 30;
                break;
            case 2:
                if (((yearNum % 4 == 0) && !(yearNum % 100 == 0)) || (yearNum % 400 == 0)) {
                    monthDays = 29;
                } else {
                    monthDays = 28;
                }
                break;
            default:
                monthDays = 120;
                break;
        }

        //determines season
        switch (monthNum) {
            case 4: case 5: case 6:
                season = "spring";
                break;
            case 7: case 8: case 9:
                season = "summer";
                break;
            case 10: case 11:
                season = "fall";
                break;
            case 12: case 1: case 2: case 3:
                season = "winter";
                break;
            default:
                season = "Not Valid";
                break;
            }

        //output
        System.out.println("The " + monthNum + monthSuffix +" month is " + monthName + " which has " + monthDays + " days and the season is " + season +".");
    }
}
