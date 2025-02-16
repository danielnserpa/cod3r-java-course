package classesandmethods;

public class ProductTest {

    public static void main(String[] args) {


        // Creating a product object

        // Call the constructor
        Product p1 = new Product();
        // We can call the constructor in a different way
        var p2 = new Product();

        // Create the object
        p1.name = "Laptop";
        p1.price = 1000;
//        p1.discount = 0.25;

        p2.name = "TV";
        p2.price = 10000;
//        p2.discount = 0.5;

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.price);
        System.out.println(p2.price);

        System.out.println(Product.discount);
        System.out.println(Product.discount);

        // We can create a variable that gets the object's variables as value;
        double finalPrice1 = p1.price * (1 - Product.discount);
        double finalPrice2 = p2.price * (1 - Product.discount);

        System.out.println(finalPrice1);
        System.out.println(finalPrice2);

        // Using the method created to give a discount over a product WITH PARAMETERS
        double discountedPrice1 = p1.discountedPrice(p1.price, Product.discount);
        System.out.println(discountedPrice1);

        // Using the "same" method created to give a discount over a product WITHOUT PARAMETERS
        double discountedPrice2 = p2.discountedPrice();
        System.out.println(discountedPrice2);

        System.out.println(p1.discountedPrice());


    }


}

