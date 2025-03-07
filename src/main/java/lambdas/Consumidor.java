package lambdas;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Product> print = p -> System.out.println(p.name);

Product p1 = new Product("Pen", 12.34, 0.9);

print.accept(p1);
    }
}
