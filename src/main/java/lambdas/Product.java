package lambdas;

public class Product {

    public final String name;
    public final double price;
    public final double discount;

    @Override
    public String toString() {
        return "Product {" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", discount = " + discount +
                '}';
    }

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;

    }
}
