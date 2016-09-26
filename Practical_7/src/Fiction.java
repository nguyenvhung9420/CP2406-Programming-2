/**
 * Created by Jake on 12/09/2016.
 */
public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    void setPrice() {
        super.price = 24.99;
    }
}
