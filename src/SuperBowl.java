/*
    Created By: Elliot J Scribner on 9/30/17
    Student ID: ejs320
    Homework #: 4 part 3
    SuperBowl: Quizzes the user on who won the super bowl in a particular year
 */

import java.util.Scanner;

public class SuperBowl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //generate random year to ask the user and take the user input
        int year = ((int)(Math.random() * 16) + 2001);
        System.out.println("Who won the superbowl in " + year + "?");
        String myGuess = input.nextLine();

        //store all winners in an array such that the year they won = the index of the array + 2001
        String[] winners = {
                "Baltimore Ravens",
                "New England Patriots",
                "Tampa Bay Buccaneers",
                "New England Patriots",
                "New England Patriots",
                "Pittsburgh Steelers",
                "Indianapolis Colts",
                "New York Giants",
                "Pittsburgh Steelers",
                "New Orleans Saints",
                "Green Bay Packers",
                "New York Giants",
                "Baltimore Ravens",
                "Seattle Seahawks",
                "New England Patriots",
                "Denver Broncos",
                "New England Patriots",
        };


        Boolean iAmWrong = false; //declare boolean for if user answer is correct
        int winnerYear = year - 2001;
        //use for loop to iterate through each team name in the array
        for (int i = 0; i <= 16; i++){
            int spaceIndex1 = winners[i].indexOf(' '); //finds index of first space in each string
            int spaceIndex2 = winners[i].lastIndexOf(' '); //finds index of second space in each string
            //creates substrings of each word in the each string
            String sub1 = winners[winnerYear].substring(0, spaceIndex1);
            String sub2 = winners[winnerYear].substring(spaceIndex1, spaceIndex2);
            String sub3 = winners[winnerYear].substring(spaceIndex2);
            //trims leading spaces off of the second and third substrings
            sub2 = sub2.trim();
            sub3 = sub3.trim();
            //check if the guess equals the original string, or any of the substrings (in case only part of the team name is entered)
            if (myGuess.equalsIgnoreCase(winners[i]) || myGuess.equalsIgnoreCase(sub1) || myGuess.equalsIgnoreCase(sub2) || myGuess.equalsIgnoreCase(sub3)) {
                System.out.println("Congratulations! You are correct.");
                return;
            } else {
                iAmWrong = true; //if incorrect, set to true
            }
        }
        //prints out incorrect message if none of the correct conditions are met
        if (iAmWrong) {
            System.out.println("Sorry, you are incorrect. The " + winners[winnerYear] + " won the super bowl in " + year);
            return;
        }
    }
}
