/**
 * Created by Jake on 12/09/2016.
 */
public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNum, double atomicWeight) {
        super(symbol, atomicNum, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Non-metal elements are bad conductors of electricity.");
    }
}
