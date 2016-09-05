package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class ScentedCandle extends Candle {
    protected String scent;

    public ScentedCandle() {
        super();
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        price = height * 3;
    }
}
