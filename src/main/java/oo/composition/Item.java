package oo.composition;

public class Item {

    String name;
    int quantity;
    double price;

    Item (String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
