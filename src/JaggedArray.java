/*
    Created By: Elliot J Scribner on 11/13/17
    Student ID: ejs320
    HW #: 9
    JaggedArray: Creates a jagged array with a random number of rows and columns, then fills each cell with a random alphabetic character
 */

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int rows = ((int)(Math.random() * (10-5)+1) + 5);
        char[][] myJaggedArray = createArray(rows);
        System.out.println("Printing character being copied from the alphabet array");
        myJaggedArray = populateArray(rows, myJaggedArray);
        System.out.println(" ");
        printArray(rows, myJaggedArray);


    }
    //Create the jagged array
    public static char[][] createArray(int rows) {
        char[][] jaggedArray = new char[rows][];
        for(int i = 0; i < rows; i++) {
            int columns = ((int)(Math.random() * (10-5)+1) + 5);
            jaggedArray[i] = new char[columns];
        }
        return jaggedArray;
    }
    //Fill the array with a random alphabetic value
    public static char[][] populateArray(int rows, char[][] jaggedArray) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; //array of letters
        int alphaIndex;
        for(int i = 0; i < rows; i++) { //assign each cell with a different value
            for(int j = 0; j < jaggedArray[i].length; j++) {
                alphaIndex = (int)(Math.random() * (26));
                jaggedArray[i][j] = alphabet[alphaIndex];
                printLetter(alphabet[alphaIndex], jaggedArray[i].length, j);
            }
        }
        return jaggedArray;
    }
    //Print entire array
    public static void printArray(int rows, char[][] jaggedArray) {
        System.out.println("Printing the ragged array");
        for(int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
    }
    //Print character as it is assigned to the array
    public static void printLetter(char letter, int length, int iteration) {
        System.out.print(letter + " ");
        if(iteration == length - 1) {
            System.out.println(" ");
        }
    }
}
