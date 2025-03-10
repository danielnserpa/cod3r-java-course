package lambdas;

import java.util.function.UnaryOperator;

public class FuncaoUnary {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int result = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);

        System.out.println(result);


    }
}
