package oo.composition.challenge;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Daniel");

        Product laptop = new Product("Laptop", 1899.5);
        Product printer = new Product("Printer", 380.8);
        Product speaker = new Product("Speaker", 213.5);

        Purchase p1 = new Purchase();

        // Using the first Purchase constructor
        p1.addItem(laptop, 2);
        p1.addItem(printer, 1);
        p1.addItem(speaker, 1);
        // Using the second Purchase constructor and adding products directly without having to create them beforehand
        p1.addItem(new Product("Mouse", 17.99), 2);

        Purchase p2 = new Purchase();

        p2.addItem(new Product("Car", 45500), 1);

        System.out.println(p1.getTotalValue());

        // Qualquer um dos dois jeitos funcionaria para assignar uma compra ao cliente, mas o segundo precisa criar o método
        // customer1.purchases.add(p1);
        customer1.addPurchase(p1);
        customer1.addPurchase(p2);

        System.out.println("Customer's name: " + customer1.name + "\nTotal money spent: " + customer1.getMoneySpent());

    }
}
