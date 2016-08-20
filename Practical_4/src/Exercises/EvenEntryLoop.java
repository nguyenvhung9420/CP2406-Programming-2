package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 21/08/2016.
 */
public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanIn.nextInt();
        while (userInput != 999) {
            if (EvenOdd.isEven(userInput)) {
                System.out.println("Good Job!");
            } else {
                System.out.println("You dun goofed.");
            }
            System.out.print("Enter a new number: ");
            userInput = scanIn.nextInt();
        }
        System.out.println("Goodbye.");
    }
}
