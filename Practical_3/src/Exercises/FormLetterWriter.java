package Exercises;

/**
 * Created by Jake on 15/08/16.
 */
public class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Jake");
        System.out.println("Thanks for your order");
        displaySalutation("Jake", "Wood");
        System.out.println("Thanks you for your recent order");
    }
        public static void displaySalutation(String s) {
            System.out.println("Hello Mr/Mrs " + s);
        }
        public static void displaySalutation(String s, String d) {
            System.out.println("Dear " + s + " " + d);
        }
}
