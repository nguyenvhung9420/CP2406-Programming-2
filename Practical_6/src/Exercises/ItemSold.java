package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class ItemSold {
    protected int invoiceNumber;
    protected String description;
    protected int price;

    public ItemSold(int invoiceNumber, String description, int price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
