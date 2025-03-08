package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> isEvenOrOdd = number -> number % 2 == 0 ? "Even" : "Odd";

        System.out.println(isEvenOrOdd.apply(5));
        System.out.println(isEvenOrOdd.apply(60));

        Function<String, String> theResultIs = value -> "The result is: " + value;

        System.out.println(isEvenOrOdd.andThen(theResultIs).apply(560));

        Function<String, String> excited = value -> value + "!!!";

        //I can print everything together in both ways:


        String finalResult = isEvenOrOdd
                .andThen(theResultIs)
                .andThen(excited)
                .apply(55);

        System.out.println(isEvenOrOdd.andThen(theResultIs).andThen(excited).apply(5));

        System.out.println(finalResult);



    }
}
