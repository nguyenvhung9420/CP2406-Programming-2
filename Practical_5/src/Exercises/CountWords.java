package Exercises;

/**
 * Created by Jake on 20/08/2016.
 */
public class CountWords {

    public static int countWords(String stringOfWords){
        String[] arrayOfWords = stringOfWords.split("-|\\.|,| |\\?|!|:|;");
        return arrayOfWords.length;
    }

}
