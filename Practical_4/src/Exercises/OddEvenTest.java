package Exercises;

/**
 * Created by Jake on 20/08/2016.
 */
public class OddEvenTest {
    public static void main(String[] args) {
        testOddEven(1, false, true);
        testOddEven(20, true, false);
        testOddEven(99, false, true);
    }

    private static void testOddEven(int num, boolean isEven, boolean isOdd){
        boolean oddResult = EvenOdd.isOdd(num);
        boolean evenResult = EvenOdd.isEven(num);
        System.out.println("" + num + " is Even => " + isEven + " : " + evenResult);
        System.out.println("" + num + " is Odd  => " + isOdd + " : " + oddResult);
        System.out.println("EvenOdd.isEven " + (isEven==evenResult?"Passed":"Failed"));
        System.out.println("EvenOdd.isOdd  " + (isOdd==oddResult?"Passed":"Failed"));
        divider();
    }

    private static void divider() {
        System.out.println("-----------------");
    }
}
