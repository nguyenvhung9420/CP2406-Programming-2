package Exercises;

/**
 * Created by Jake on 5/09/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold a = new ItemSold(1234, "some shitty object", 69);
        PetSold b = new PetSold(4321, "pet", 200, true, true, true);
        System.out.println("invoice num: " + a.getInvoiceNumber() + ". desc: " + a.getDescription() + ". Price: " + a.getPrice());
        System.out.println("invoice num: " + b.getInvoiceNumber() + ". desc: " + b.getDescription() + ". Price: " + b.getPrice() + " vacc " + b.isVaccinated() + " neutered " + b.isNeutered() + " houseborken " + b.isHousebroken());
    }
}
