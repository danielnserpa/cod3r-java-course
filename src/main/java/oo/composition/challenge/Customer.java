package oo.composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    String name;
    List<Purchase> purchases = new ArrayList<>();

    Customer (String name) {
        this.name = name;
    }

    public void addPurchase (Purchase purchase) {
        this.purchases.add(purchase);
    }

    public double getMoneySpent () {
        double moneySpent = 0;

        for (Purchase purchase : purchases) {
            moneySpent += purchase.getTotalValue();
        }

        return moneySpent;
    }

}
