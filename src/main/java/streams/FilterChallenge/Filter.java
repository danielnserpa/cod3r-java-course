package streams.FilterChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        Car c1 = new Car("Monza", 1987, "Gasolina");
        Car c2 = new Car("Brasilia", 1994, "Diesel");
        Car c3 = new Car("Savero", 2015, "Diesel");
        Car c4 = new Car("Sandero", 2017, "Alcool");
        Car c5 = new Car("Ferrari", 2025, "Diesel");
        Car c6 = new Car("Fusca", 1972, "Gasolina");

        List<Car> cars = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Car> isDiesel = c -> c.fuel.equalsIgnoreCase("Diesel");
        Predicate<Car> isYear = c -> c.year >= 1990;
        Function<Car, String>  message = c -> "Your car " + c.name + " uses " + c.fuel + " and is from " + c.year;

        cars.stream()
                .filter(isDiesel)
                .filter(isYear)
                .map(message)
                .forEach(System.out::println);

    }


}
