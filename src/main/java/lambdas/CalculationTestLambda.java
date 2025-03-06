package lambdas;

public class CalculationTestLambda {
    public static void main(String[] args) {

        // Jeito mais basico de se definir uma funcao lambda
//        Calculation soma = (x, y) -> {
//            return x + y;
//        };

        // Tambem poderia ser assim:
        Calculation soma = (x, y) -> x + y;
        System.out.println(soma.execute(2, 5));

        Calculation mult = (x, y) -> x * y;
        System.out.println(mult.execute(2, 3));

        Calculation div = (x, y) -> x / y;
        System.out.println(div.execute(3, 5));

    }
}
