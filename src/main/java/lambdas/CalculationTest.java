package lambdas;

public class CalculationTest {
    public static void main(String[] args) {

        Calculation sum = new Sum();
        Calculation multiply = new Multiply();

        System.out.println(sum.execute(2, 3));
        System.out.println(multiply.execute(2, 3));
    }
}
