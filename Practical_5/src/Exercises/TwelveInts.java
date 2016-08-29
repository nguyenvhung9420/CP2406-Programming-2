package Exercises;

/**
 * Created by Jake on 29/08/2016.
 */
public class TwelveInts {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for(int i = 0; i < intArray.length; i++) {
            System.out.print("" + intArray[i] + " ");
        }
        System.out.println();
        for(int i = intArray.length - 1; i >= 0; i--) {
            System.out.print("" + intArray[i] + " ");
        }

    }




}
