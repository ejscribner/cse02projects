/*
    Created By: Elliot J Scribner on 11/30/17
    Student ID: ejs320
    Lab #: 9
    TestMatrix: Creates two matricies and adds them together
 */

import java.util.Arrays;

public class TestMatrix {
    public static void main(String[] args) {
        int[][] m1 = createMatrix(3,3);
        int[][] m2 = createMatrix(3,3);
        printMatrix(m1);
        printMatrix(m2);
        int[][] summedMatrix = addMatrixNum(m1,m2);
        printMatrix(summedMatrix);
    }
    //prints out a matrix using a for loop
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
    //creates a matrix of specified size and fills it with random integers
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                matrix[i][j] = ((int)(Math.random() * (9-1)+1) + 1);
            }
        }
        return matrix;
    }
    //uses matrix addition to sum the two matricies
    public static int[][] addMatrixNum(int[][] m1, int[][] m2) {
        int[][] summed = new int[3][3];
        for(int i = 0; i < summed.length; i++) {
            for(int j = 0; j< summed[i].length; j++) {
                summed[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return summed;
    }
}
