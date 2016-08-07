package Exercises;

/**
 * Created by Jake on 7/08/2016.
 */
public class TicketNumber {

    private static String[] splitTicketNumber (String ticketNumber) {
        String[] splitTicket = new String[2];
        ticketNumber = ticketNumber.trim();
        splitTicket[0] = ticketNumber.substring(0, ticketNumber.length()-1);
        splitTicket[1] = ticketNumber.substring(ticketNumber.length()-1);
        return splitTicket;
    }

    public static boolean checkTicketNumber (String ticketNumber){
        String[] splitTicketArray = splitTicketNumber(ticketNumber);
        int mainTicketNumber = Integer.parseInt(splitTicketArray[0]);
        int trailingTicketNumber = Integer.parseInt(splitTicketArray[1]);

        if (mainTicketNumber % 7 != trailingTicketNumber){
            return false;
        } else {
            return true;
        }
    }



}
