package Exercises;

/**
 * Created by Jake on 20/08/2016.
 */
public class CellPhoneServiceTest {
    public static void main(String[] args) {
        testCellPhoneService(100, 0, 4, "Plan E @ $79/month");
        testCellPhoneService(100, 0, 1, "Plan F @ $87/month");
        testCellPhoneService(100, 200, 0, "Plan D @ $70/month");
        testCellPhoneService(600, 0, 0, "Plan C @ $61/month");
        testCellPhoneService(100, 50, 0, "Plan B @ $55/month");
        testCellPhoneService(100, 0, 0, "Plan A @ $49/month");
        // Need edge cases and more rigorous testing

    }

    private static void testCellPhoneService(int talkHours, int textCount, int gbUsed, String planExpected) {
        String resultPlan = CellPhoneService.calculateOptimalMonthlyPlan(talkHours,textCount,gbUsed);
        System.out.println("Talk: " + talkHours + "hrs, Texts: " + textCount + " sent, GB Used: " + gbUsed + " Gb.");
        System.out.println(planExpected + " : " + resultPlan);
        System.out.println(resultPlan == planExpected ? "Passed" : "Failed");
    }
}