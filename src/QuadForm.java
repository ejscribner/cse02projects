import java.util.Scanner;

public class QuadForm {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = -4;
        double answer1;
        double answer2;

        answer1 =(-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
        answer2 =(-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;

        System.out.println(answer1);
        System.out.println(answer2);

    }
}
