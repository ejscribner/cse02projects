/*
    Created By: Elliot J Scribner on Sep 28 2017
    Student ID: ejs320
    Lab #: 4
    CasinoGames: Prompts user to pick a casino game, then plays that game
 */


import java.util.Scanner;

public class CasinoGames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which game would you like to play? (Enter R for roulette, C for craps, or P for pick a card)");
        String game = input.next();
        int gameNum = 0;

        //Check which game to play
        if (game.equals("R") || game.equals("r")) {
            gameNum = 1;
        } else if (game.equals("C") || game.equals("c")) {
            gameNum = 2;
        } else if (game.equals("P") || game.equals("p")) {
            gameNum = 3;
        } else {
            System.out.println("***Error - Incorrect input: Choose a valid option***");
            main(null);
        }

        //Play games
        switch (gameNum) {
            case 1:
                //Do Roulette
                System.out.println("You are playing Roulette! Pick a color to bet on (R/B for Red/Black)");
                String colorBetting = input.next();
                if (!(colorBetting.equals("R") || colorBetting.equals("r") || colorBetting.equals("b") || colorBetting.equals("b"))) {
                    System.out.println("***Error - Incorrect color value. Please chose a valid color (R or B)");
                    main(null);
                }
                System.out.println("How much do you want to bet?");
                int numBet = input.nextInt();
                int rouletteNum = 0 + (int) (Math.random() * ((36 - 0) + 1));
                if ((colorBetting.equals("R") || colorBetting.equals("r")) && (rouletteNum % 2 == 0)) {
                    System.out.println("Congratulations! Your random number is " + rouletteNum + "! You won " + numBet*2 + " dollars!");
                } else if ((colorBetting.equals("B") || colorBetting.equals("b")) && (rouletteNum % 2 != 0)) {
                    System.out.println("Congratulations! Your random number is " + rouletteNum + "! You won " + numBet*2 + " dollars!");
                } else if (rouletteNum == 0) {
                    System.out.println("Sorry, your number is " + rouletteNum + ". You loose");
                } else {
                    System.out.println("Sorry, your number is " + rouletteNum + ". You loose");
                }
                break;
            case 2:
                //Do Craps
                int crapsNum1 = (int)(6.0 * Math.random()) + 1;
                int crapsNum2 = (int)(6.0 * Math.random()) + 1;
                System.out.println("Your craps numbers are "+ crapsNum1 +" and "+ crapsNum2 +". Thank you for playing!");
                break;
            case 3:
                //Do Pick Card
                int cardNum = (int)(13.0 * Math.random()); //Pick number for card (number between 0 and 12 because array index starts at 0)
                int suitNum = (int)(4.0 * Math.random()); //Same as above
                String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"} ;
                String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
                System.out.println("You have drawn the "+ card[cardNum] +" of "+ suit[suitNum] +"! Thanks for playing!");
                break;
            default:
                break;
        }
    }

}

