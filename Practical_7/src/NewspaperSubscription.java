/**
 * Created by Jake on 12/09/2016.
 */
public abstract class NewspaperSubscription {
    String name;
    String address;
    int rate;

    public NewspaperSubscription(String name, String address, int rate) {
        setName(name);
        this.rate = rate;

        if (!setAddress(address)) {
            System.out.println("Address Not Valid.");
        } else {
            System.out.println("Address Correct");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public int getRate() {
        return rate;
    }

    public abstract boolean setAddress(String address);
}
