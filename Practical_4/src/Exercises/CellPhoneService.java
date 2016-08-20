package Exercises;

/**
 * Created by Jake on 20/08/2016.
 */
public class CellPhoneService {

    public static String calculateOptimalMonthlyPlan(int talkHours, int textCount, int gbUsed) {
        // if talkHours < 500hrs, no text or data -> Plan A @ $49/month
        // if talkHours < 500hrs, any text (data not specified) -> Plan B @ $55/month
        // if talkHours > 500hrs, text < 100 messages, no data -> Plan C @ $61/month
        // if texts > 100 (Otherwise same as Plan C) -> Plan D @ $70/month
        // if need data < 2Gb -> Plan E @ $79/month
        // if data > 2Gb -> Plan F @ $87/month

        if(gbUsed >= 2) {
            return "Plan E @ $79/month";
        } else if (gbUsed > 0 && gbUsed < 2) {
            return "Plan F @ $87/month";
        } else if (textCount >= 100) {
            return "Plan D @ $70/month";
        } else if (talkHours >= 500) {
            return "Plan C @ $61/month";
        } else if (talkHours < 500 && textCount < 100 && textCount > 0) {
            return "Plan B @ $55/month";
        } else {
            return "Plan A @ $49/month";
        }
    }

}
