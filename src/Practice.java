import com.sun.deploy.util.ArrayUtil;
        import com.sun.tools.javac.util.ArrayUtils;

        import java.util.Arrays;
        import java.util.Collections;

        import javafx.application.Application;
        import javafx.geometry.Insets;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.FlowPane;
        import javafx.stage.Stage;
        import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Practice {
    public static void main(String[] args) {
        String[] names = {"Jane", "Jack", "Tom", "Jackie", "Lisa"};
        String[] subjects = {"Chem", "Bio", "Math", "CSE",};
        int[][][] myScores = createArray();
        myScores = fillArray(myScores);
        printArray(myScores, names, subjects);
    }
    public static int[][][] createArray() {
        int[][][] scores = new int[5][4][3];
        return scores;
    }
    public static int[][][] fillArray(int[][][] scores) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                for (int k = 0; k < scores[i][j].length; k++) {
                    scores[i][j][k] = 60 + (int) (Math.random() * ((100 - 60) + 1));
                }
            }
        }
        return scores;
    }
    public static void printArray(int[][][] scores, String[] names, String[] subjects) {
        for(int i = 0; i < scores.length; i++) {
            System.out.println(names[i]);
            for(int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " ");
                for(int k = 0; k < scores[i][j].length; k++) {
                    System.out.print(scores[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
