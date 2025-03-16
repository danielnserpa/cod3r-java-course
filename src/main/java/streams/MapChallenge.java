package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MapChallenge {
    public static void main(String[] args) {

        /*

         */

        Consumer<Integer> print = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> convertToBinary = n -> Integer.toBinaryString(n);
        Function<String, String> reverse = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> convertToInteger = n -> Integer.parseInt(n, 2);

        nums.stream().map(convertToBinary).map(reverse).map(convertToInteger).forEach(print);

        // Printing infinitea
//        UnaryOperator<Integer> convertToInteger = n ->
    }
}
7