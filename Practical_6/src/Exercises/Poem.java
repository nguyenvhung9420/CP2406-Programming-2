package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class Poem {
    protected String title;
    protected int lines;

    public Poem(String title, int lines) {
        this.title = title;
        this.lines = lines;
    }

    public String getTitle() {
        return title;
    }

    public int getLines() {
        return lines;
    }
}
