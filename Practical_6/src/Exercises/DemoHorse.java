package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class DemoHorse
{
    public static void main(String[] args) {
        Horse a = new Horse("Penis", 2069, "Shit-stain");
        RaceHorse b = new RaceHorse("FastPenis", 1969, "Baby-shit-green", 69);
        System.out.println("Horse Name is " + a.getName() + ". Horse birth year is " + a.getBirthYear() + ". Horse colour is " + a.getColour() + ".");
        System.out.println("Horse Name is " + b.getName() + ". Horse birth year is " + b.getBirthYear() + ". Horse colour is " + b.getColour() + ". Number of Races is " + b.getNumRaces() + ".");
    }
}
