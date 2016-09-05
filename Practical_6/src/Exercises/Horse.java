package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class Horse {
    String name;
    int birthYear;
    String colour;

    public Horse(String name, int birthYear, String colour) {
        this.name = name;
        this.birthYear = birthYear;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
