package Exercises;

/**
 * Created by Jake on 21/08/2016.
 */
public class DiagonalOs {
    public static void main(String[] args) {
        int numberOfOs = 10;
        for(int j = 0; j < numberOfOs; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(" ");
            }
            System.out.println("O");
        }
    }
}
