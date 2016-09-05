package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("couplet");
        Limerick limerick = new Limerick("limerick");
        Haiku haiku = new Haiku("haiku");
        System.out.println("Title: " + couplet.getTitle() + ". Lines: " + couplet.getLines());
        System.out.println("Title: " + limerick.getTitle() + ". Lines: " + limerick.getLines());
        System.out.println("Title: " + haiku.getTitle() + ". Lines: " + haiku.getLines());
    }
}
