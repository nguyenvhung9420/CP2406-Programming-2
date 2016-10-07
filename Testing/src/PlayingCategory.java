/**
 * Created by Jake on 12/09/2016.
 */
public enum PlayingCategory {
    HARDNESS,
    SPECIFIC_GRAVITY,
    CLEAVAGE,
    CRUSTAL_ABUNDANCE,
    ECONOMIC_VALUE,
    ANY;

    @Override
    public String toString() {
        switch (this) {
            case HARDNESS:
                return "Hardness";
            case SPECIFIC_GRAVITY:
                return "Specific Gravity";
            case CLEAVAGE:
                return "Cleavage";
            case CRUSTAL_ABUNDANCE:
                return "Crustal Abundance";
            case ECONOMIC_VALUE:
                return "Economic Value";
            default:
                return "any";
        }
    }
}
