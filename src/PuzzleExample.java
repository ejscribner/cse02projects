/*
    Created By: Elliot J Scribner on 12/5/17
    Student ID: ejs320
    Lab #: **Num**
    PuzzleExample: **Description**
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class PuzzleExample {
    public static void main(String[] args) {
        int [] x={1,2,4,6};
        double[] u={3,4,5,6,7}, v = {2,4,5};
        System.out.println(puzzle(u,v,x));
    }
    public static int puzzle(double x[], double y[], int[] z) {
        double [] temp;
        temp = x;
        temp[z[2]]=42;
        x[0] = 2.34;
        return z[z[0]];
    }
}
