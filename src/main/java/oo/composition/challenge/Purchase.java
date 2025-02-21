package oo.composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    List<Item> itens = new ArrayList<>();

    public void addItem (Product product, int quantity){
        this.itens.add(new Item(product, quantity));
    }

    public void addItem (String name, double price, int quantity) {
        this.itens.add(new Item(new Product(name, price), quantity));
    }

    public double getTotalValue () {
        double totalValue = 0;

        for (Item item : itens) {
            totalValue += item.quantity * item.product.price;
        }

        return totalValue;

    }

}
