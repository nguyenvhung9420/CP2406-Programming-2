import com.sun.java.browser.plugin2.DOM;

/**
 * Created by Jake on 12/09/2016.
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision div1 = new InternationalDivision("PenisInt", 1, "PenIsland", "Gibbber");
        DomesticDivision div2 = new DomesticDivision("PenisLocal", 2, "PenisLand");
        div1.display();
        div2.display();

    }
}
