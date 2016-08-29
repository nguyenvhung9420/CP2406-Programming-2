package Exercises;

/**
 * Created by Jake on 29/08/2016.
 */
public class ArrayMethodDemo {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        displayAllInts(intArray);
        displayAllIntsReversed(intArray);
        displaySum(intArray);
        displayAllLessThan(intArray, 5);
        displayAllGreaterThanAverage(intArray);


    }

    static public void displayAllInts(int[] intArray) {
        for(int i = 0; i < intArray.length; i++) {
            System.out.print("" + intArray[i] + " ");
        }
        System.out.println();
    }

    public static void displayAllIntsReversed(int[] intArray) {
        for(int i = intArray.length - 1; i >= 0; i--) {
            System.out.print("" + intArray[i] + " ");
        }
        System.out.println();
    }

    public static void displaySum(int[] intArray) {
        int sum = 0;
        for(int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("Sum of Array elements = " + sum);

    }

    public static void displayAllLessThan(int[] intArray, int limit) {
        for(int i = intArray.length - 1; i >= 0; i--) {
            if(intArray[i] < limit) {
                System.out.print("" + intArray[i] + " ");
            }
        }
        System.out.println();
    }

    public static void displayAllGreaterThanAverage(int[] intArray) {
        int sum = 0;
        for(int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        for(int i = intArray.length - 1; i >= 0; i--) {
            if(intArray[i] > (sum/intArray.length)) {
                System.out.print("" + intArray[i] + " ");
            }
        }
        System.out.println();
    }

}
