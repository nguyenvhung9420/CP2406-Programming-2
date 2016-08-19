package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 15/08/2016.
 */
public class NumbersDemo2 {
    public static void main(String[] args) {

        Scanner scanIn = new Scanner(System.in);
        System.out.print("Give me number 1: ");
        int number1 = scanIn.nextInt();
        System.out.println("Give me number 2: ");
        int number2 = scanIn.nextInt();

        displayTwiceTheNumber(number1);
        displayNumberPlusFive(number1);
        displayNumberSquared(number1);

        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number2);
        displayNumberSquared(number2);
    }

    public static void displayTwiceTheNumber(int number){
        System.out.println("Twice " + number + " is " + (2 * number));
    }

    public static void displayNumberPlusFive(int number){
        System.out.println("" + number + " plus 5 is " + (number + 5));
    }

    public static void displayNumberSquared(int number){
        System.out.println("" + number + " squared is " + (number*number));
    }
}
