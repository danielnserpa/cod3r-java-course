package lambdas;

public class Product {

    final String name;
    final double price;
    final double discount;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;

    }
}
