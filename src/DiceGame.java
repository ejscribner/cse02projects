/*
    Created By: Elliot J Scribner on 10/16/17
    Student ID: ejs320
    HW #: 6
    DiceGame: Compares two sets of dice rolls to determine a winner (with methods)
 */

public class DiceGame {
    public static void main(String[] args) {
        //set scoreboard numbers to zero
        int compTotal = 0;
        int userTotal = 0;

        //define a variable for winning party and a variable for each teams points
        String winner;
        int winVal = 0;
        int loseVal = 0;

        //roll dice and calculate score
        for (int i = 0; i < 10; i++) {
            int computer = genDie();
            int user = genDie();
            System.out.print("User: " + user + " ");
            System.out.println("Computer: " + computer);
            if (computer > user) {
                compTotal++;
            } else if (user > computer) {
                userTotal++;
            }
        }

        winner = getWinner(userTotal, compTotal);

        //assign winning team and their points values
        if (winner == "computer") {
            winner = "Computer";
            winVal = compTotal;
            loseVal = userTotal;
        } else if (winner == "user") {
            winner = "User";
            winVal = compTotal;
            loseVal = userTotal;
        } else if (winner == "1"){
            winner = "Tie";
            winVal = compTotal;
            loseVal = userTotal;
        }

        //print out statement of who won
        printMsg(winner, winVal, loseVal);
    }

    //generates dice random number
    public static int genDie() {
        int die = ((int)(Math.random() * 6-1) + 1);
        return die;
    }

    //get winner name
    public static String getWinner(int user, int computer) {
        if (user > computer) {
            return "user";
        } else if (computer > user) {
            return "computer";
        } else {
            return "1";
        }
    }

    //print out winner message
    public static void printMsg(String winner, int winVal, int loseVal) {
        System.out.println("The grand winner is: " + winner + " with " + winVal + ". The looser had " + loseVal);
    }

}
