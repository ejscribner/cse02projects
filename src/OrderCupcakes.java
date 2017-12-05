/*
    Created By: Elliot J Scribner on Sep 14 2017
    Student ID: ejs320
    Lab #: 3
    OrderCupcakes: Calculates number of cupcakes to order and the cost. (Updated)
 */

import java.util.Scanner;

public class OrderCupcakes {
    public static void main(String[] args) {
        //Scanner
        Scanner input;
        input = new Scanner(System.in);

        //Inputs
        System.out.println("Enter number of friends: ");
        int numberOfFriends = input.nextInt();                //Number of friends
        System.out.println("Enter number of cupcakes per person: ");
        int numberOfCupcakesPerPerson = input.nextInt();      //Each person will have 4 cupcakes
        System.out.println("Enter number of cupcakes per pack: ");
        int numberOfCupcakesPerPack = input.nextInt();        //Each pack contains 8 cupcakes
        System.out.println("Enter cost per pack: ");
        double costOfEachPack = input.nextDouble();          //This value includes tax

        //Outputs
        int totalNumberOfPersons;
        double totalNumberOfCupcakes;
        double totalNumberOfPacks;                //How many packs you need
        double totalCostOfCupcakes;             //How much it will cost for all cupcakes

        //Computation
        totalNumberOfPersons = ++numberOfFriends;
        totalNumberOfCupcakes = numberOfCupcakesPerPerson*totalNumberOfPersons;
        totalNumberOfPacks = totalNumberOfCupcakes/numberOfCupcakesPerPack;
        totalCostOfCupcakes = totalNumberOfPacks*costOfEachPack;

        //Round to two decimal places
        totalCostOfCupcakes = Math.round(totalCostOfCupcakes*100.0);
        totalCostOfCupcakes = totalCostOfCupcakes/100.0;

        //Print Statements
        System.out.println("Total number of persons: "+ totalNumberOfPersons);
        System.out.println("Total number of cupcakes: "+ totalNumberOfCupcakes);
        System.out.println("Total number of packs: "+ totalNumberOfPacks);
        System.out.println("Total cost of cupcakes: "+ totalCostOfCupcakes);
        System.out.println("I will need to order "+ totalNumberOfCupcakes +" cupcakes and the total cost is "+ totalCostOfCupcakes);

    }
}
