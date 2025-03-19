package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        // Posso printar diretamente usando .ifPresent ou assigning the value to a variable

        nums.stream()
                .reduce(sum)
                .ifPresent(System.out::println);

        Integer total = nums.stream()
                .reduce(sum).get();

        System.out.println(total);

        Integer total2 = nums.stream()
                .reduce(100, sum);

        System.out.println(total2);

        // I can make a parallel stream but the acum will be added on every single iteration
        Integer total3 = nums.parallelStream().reduce(100, sum);

        System.out.println(total3);


        nums.stream()
                .filter(n -> n > 5)
                .reduce(sum)
                .ifPresent(System.out::println);
    }
}
