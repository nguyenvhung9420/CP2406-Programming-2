/**
 * Created by Jake on 12/09/2016.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("Politics");
        NonFiction book2 = new NonFiction("Magic The Gathering");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

    }
}
