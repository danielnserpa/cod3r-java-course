package classesAndMethods;

public class Product {

    String name;
    double price;
    double discount;


    double discountedPrice (){
        return price - discount;
    }
    double discountedPrice (double price, double discount) {

        return price - discount;
    }
}
