package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 7/08/2016.
 */
public class NauticalMilesInteractive {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double nauticalMiles = reader.nextDouble();
        double[] kmAndMiles = NauticalMiles.kmAndMilesInNauticalMiles(nauticalMiles);
        System.out.println("Given " + nauticalMiles + " Nautical Miles there are " + kmAndMiles[0] + " Kilometers and " + kmAndMiles[1] + " Miles.");
        System.out.println("Have nice day.");
    }
}
