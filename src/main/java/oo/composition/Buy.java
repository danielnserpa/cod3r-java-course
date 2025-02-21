package oo.composition;

import java.util.ArrayList;

public class Buy {

    String client;
    ArrayList<Item> itens = new ArrayList<>();

    double getTotalValue() {
        double value = 0;

        for (Item item : itens) {
            value += item.price * item.quantity;
        }

        return value;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "client='" + client + '\'' +
                ", totalValue=" + getTotalValue() +
                '}';
    }
}
