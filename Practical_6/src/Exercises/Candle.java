package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class Candle {
    protected String colour;
    protected int height;
    protected int price;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(int height) {
        this.height = height;
        price = this.height * 2;
    }

    public String getColour() {
        return colour;
    }

    public int getHeight() {
        return height;
    }

    public int getPrice() {
        return price;
    }
}
