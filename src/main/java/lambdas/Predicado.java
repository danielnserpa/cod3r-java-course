package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Product prod = new Product("Laptop", 2500, 0.1);

        Predicate<Product> isExpensive = product -> (product.price * ( 1 - product.discount)) > 1750;

        System.out.println(isExpensive.test(prod));

    }
}
