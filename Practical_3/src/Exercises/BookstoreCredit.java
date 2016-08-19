package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 15/08/2016.
 */
public class BookstoreCredit {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = scanIn.next();
        System.out.print("Input GPA: ");
        double gpa = scanIn.nextDouble();
        displayCreditsAndStuff(name, gpa);

    }

    public static void displayCreditsAndStuff(String name, double gpa){
        System.out.println("Hi " + name + ". Nice gpa of " + gpa + ". Have some money: $" + gpa * 10 + ".");
    }

}
