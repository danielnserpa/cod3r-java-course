package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {

       BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(5.8, 4.4));

        // Different ways to do the same thing
        BiFunction<Double, Double, String> approval = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Approved" : "Failed";
        System.out.println(approval.apply(8.5, 7.0));

        BiFunction<Double, Double, String> result = (n1, n2) -> {
          double finalGrade = (n1 + n2) / 2;
          return finalGrade >= 7 ? "Approved" : "Failed";
        };

        System.out.println(result.apply(4.3, 4.1));

    }
}
