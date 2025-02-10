package classesAndMethods;

public class ProductTest {

    public static void main(String[] args) {


        // Creating a product object

        // Call the constructor
        Product p1 = new Product();

        // Create the object
        p1.name = "Laptop";
        p1.price = 4556;
        p1.discount = 0.25;

        // We can call the constructor in a different way

        var p2 = new Product();

        p2.name = "TV";
        p2.price = 12985;
        p2.discount = 0.5;

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.price);
        System.out.println(p2.price);

        System.out.println(p1.discount);
        System.out.println(p2.discount);

        double finalPrice1 = p1.price - p1.discount;
        double finalPrice2 = p2.price - p2.discount;

        System.out.println(finalPrice1);
        System.out.println(finalPrice2);

    }
}
