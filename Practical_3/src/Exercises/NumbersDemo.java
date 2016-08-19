package Exercises;

/**
 * Created by Jake on 15/08/2016.
 */
public class NumbersDemo {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 25;

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
