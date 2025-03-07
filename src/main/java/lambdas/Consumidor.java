package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        //Esta criando uma interface funcional Consumer, que nao retorna nada, pois consumer nao retorna nada
        // print é o nome do objeto de um Consumer<Product>
        // p é o parametro da expressao lambda que será passado dentro de print, que executa a funcao lambda de printar p.name
        Consumer<Product> print = p -> System.out.println(p.name);

        Product p1 = new Product("Pen", 12.34, 0.9);

        print.accept(p1);

        Product p2 = new Product("Shirt", 12.34, 0.9);
        Product p3 = new Product("Trousers", 12.34, 0.9);
        Product p4 = new Product("Lapis", 12.34, 0.9);
        Product p5 = new Product("Hat", 12.34, 0.9);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

        products.forEach(print);
        products.forEach(p -> System.out.println(p.price));
        products.forEach(System.out::println);

    }
}
