package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 7/08/2016.
 */
public class MinutesConversionTest {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter Minutes: ");
        double minutes = scanIn.nextDouble();
        System.out.println("" + minutes + " minutes is the same as " +
                MinutesConversion.minsToHours(minutes) + " hours or " +
                MinutesConversion.minsToDays(minutes) + " days.");
    }
}
