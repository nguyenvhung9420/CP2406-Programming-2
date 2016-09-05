package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle a = new Candle();
        a.setColour("penis");
        a.setHeight(69);

        System.out.println("" + a.getColour() + " " + a.getHeight() + " inches. $" + a.getPrice());

        ScentedCandle b = new ScentedCandle();
        b.setColour("shit");
        b.setHeight(6969);
        b.setScent("shit-smell");

        System.out.println("" + b.getColour() + " " + b.getHeight() + " inches. $" + b.getPrice() + " " + b.getScent());

    }
}
