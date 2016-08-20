package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 20/08/2016.
 */
public class CountWordsInputAndTest {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        String stringOfWords = scanIn.nextLine();
        System.out.println("There are " + CountWords.countWords(stringOfWords) + " words in this string.");

        System.out.println("Begin Testing: ");
        testCountWords("The Quick Brown Fox Jumps Over the lazy dog.", 9);
        testCountWords(" ", 0);

    }

    private static void testCountWords(String testString, int expectedCount) {
        System.out.println("Testing: \"" + testString + "\"");
        int resultCount = CountWords.countWords(testString);
        System.out.print("Result => " + expectedCount + " : " + resultCount + " => ");
        if (resultCount != expectedCount) {
            System.out.println("Failed.");
        } else {
            System.out.println("Passed.");
        }
    }

}
