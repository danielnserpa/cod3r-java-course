package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> upperCase = n -> n.toUpperCase();
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        UnaryOperator<String> scream = n -> n + "!!!!!! ";

        System.out.println("\n");

        marcas.stream()
                .map(upperCase)
                .map(firstLetter)
                .map(scream)
                .forEach(print);

    }
}
