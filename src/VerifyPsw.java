/*
    Created By: Elliot J Scribner on 10/14/17
    Student ID: ejs320
    HW #: 6
    VerifyPsw: Verifies that an entered password is valid (three requirements)
 */

    import java.util.Scanner;

public class VerifyPsw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password with at least one uppercase character, one lowercase character, and a digit: ");
        String myPassword = input.nextLine(); //password entered
        int passLength = myPassword.length(); //password length
        //check the three conditions
        Boolean hasUpperCase = hasUpperCase(myPassword, passLength);
        Boolean hasLowerCase = hasLowerCase(myPassword, passLength);
        Boolean hasDigit = hasDigit(myPassword, passLength);
        //print if the password is valid or not
        if (hasUpperCase && hasLowerCase && hasDigit) {
            System.out.println("The password of " + myPassword + " is a valid password");
        } else {
            System.out.println("The password of " + myPassword + " is an invalid password");
            main(null);
        }

    }

    //check if any characters are uppercase
    public static boolean hasUpperCase(String password, int length) {
        Boolean hasUpperCase = false;
        for (int i = 0; i < length; i++) {
            char currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                return true;
            }
        }
        return hasUpperCase;
    }

    //check if any of the characters are lowercase
    public static boolean hasLowerCase(String password, int length) {
        Boolean hasUpperCase = false;
        for (int i = 0; i < length; i++) {
            char currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                return true;
            }
        }
        return hasUpperCase;
    }

    //check if any of the characters are digits
    public static boolean hasDigit(String password, int length) {
        Boolean hasUpperCase = false;
        for (int i = 0; i < length; i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                return true;
            }
        }
        return hasUpperCase;
    }
}
