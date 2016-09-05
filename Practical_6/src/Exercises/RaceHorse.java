package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class RaceHorse extends Horse {
    int numRaces;

    public RaceHorse(String name, int birthYear, String colour, int numRaces) {
        super(name, birthYear, colour);
        this.numRaces = numRaces;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }
}
