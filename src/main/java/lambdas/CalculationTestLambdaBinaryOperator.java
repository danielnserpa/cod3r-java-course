package lambdas;

import java.util.function.BinaryOperator;

public class CalculationTestLambdaBinaryOperator {
    public static void main(String[] args) {

        // Jeito mais basico de se definir uma funcao lambda
//        Calculation soma = (x, y) -> {
//            return x + y;
//        };

        // Tambem poderia ser assim:

        BinaryOperator<Double> soma = (x, y) -> x + y;
        System.out.println(soma.apply(2.0, 5.0));

        Calculation mult = (x, y) -> x * y;
        System.out.println(mult.execute(2, 3));

        Calculation div = (x, y) -> x / y;
        System.out.println(div.execute(3, 5));
        
    }
}
