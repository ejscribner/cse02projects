import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a date in mm/dd/yyyy format: ");
        String stringDate = input.next();
        int slash = stringDate.indexOf('/');
        int slash2 = stringDate.lastIndexOf('/');

        String sMonth = stringDate.substring(0, slash);
        String sDay = stringDate.substring(slash+1, slash2);
        String sYear = stringDate.substring(slash+1, stringDate.length());

        if (sYear.length() == 4) {
            sYear = sYear.substring(2,4);
        }
        int month = Integer.parseInt(sMonth);
        int day = Integer.parseInt(sDay);
        int year = Integer.parseInt(sYear);

        if (month*day == year) {
            System.out.println(stringDate + " is a magic date.");
        } else {
            System.out.println(stringDate + " is not a magic date.");
        }

        System.out.println(sMonth);
        System.out.println(sDay);
        System.out.println(sYear);

    }
}
