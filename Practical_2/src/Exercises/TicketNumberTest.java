package Exercises;

import java.util.Scanner;

/**
 * Created by Jake on 7/08/2016.
 */
public class TicketNumberTest {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input Ticket Number: ");
        String ticketNumber = scanIn.nextLine();
        System.out.println(TicketNumber.checkTicketNumber(ticketNumber));

        System.out.println("\r\nAutomated Test Begin:");
        System.out.println("------\r\nInput: 123454 \r\nExpecting: true\r\nResult   : " + TicketNumber.checkTicketNumber("123454"));
        System.out.println("------\nInput: 147103 \r\nExpecting: true\r\nResult   : " + TicketNumber.checkTicketNumber("147103"));
        System.out.println("------\nInput: 154123 \r\nExpecting: false\r\nResult   : " + TicketNumber.checkTicketNumber("154123"));
    }
}
