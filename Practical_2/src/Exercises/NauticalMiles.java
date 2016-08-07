package Exercises;

/**
 * Created by Jake on 7/08/2016.
 */
public class NauticalMiles {
    private static final double KM_IN_NAUTICAL_MILE = 1.852;
    private static final double MILES_IN_NAUTICAL_MILE = 1.150779;

    public static double kmToNauticalMiles (double kmValue){
        // Kilometers / Kilometers per Nautical Mile = Nautical Miles
        return kmValue / KM_IN_NAUTICAL_MILE;
    }

    public static double milesToNauticalMiles (double milesValue) {
        // Miles / Miles per Nautical Miles = Nautical Miles
        return milesValue / MILES_IN_NAUTICAL_MILE;
    }

    public static double[] kmAndMilesInNauticalMiles (double nauticalMiles){
        double[] kmAndMiles = new double[2];
        kmAndMiles[0] = nauticalMiles*KM_IN_NAUTICAL_MILE;
        kmAndMiles[1] = nauticalMiles*MILES_IN_NAUTICAL_MILE;
        return kmAndMiles;
    }


}
