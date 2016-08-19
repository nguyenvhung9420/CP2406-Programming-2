package Exercises;

/**
 * Created by Jake on 15/08/16.
 */
public class Billing {
    public static void main(String[] args) {
        System.out.println( computeBill(60.00));
        System.out.println( computeBill(60.00,5));
        System.out.println( computeBill(60.00,5,10));

    }

        public static double computeBill(double s) {
            return s*1.08;
        }

        public static double computeBill(double s, double d) {
            return (s*d)*1.08;
        }

        public static double computeBill(double s, double d, double f) {
        return ((s*d)-f)*1.08;
    }
}
