package streams.FilterChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AnimalFilter {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog", "black", 9);
        Animal cat = new Animal("Cat", "White", 12);
        Animal turtle = new Animal("Turtle", "None", 104);
        Animal wolf = new Animal("Wolf", "Grey", 14);
        Animal whale = new Animal("Whale", "None", 89);
        Animal parrot = new Animal("Parrot", "None", 13);

        List<Animal> animals = Arrays.asList(dog, cat, turtle, whale, wolf, parrot);

        Predicate<Animal> noFur = a -> a.furColor.equalsIgnoreCase("None");
        Predicate<Animal> age = a -> a.age >= 10;
        Function<Animal, String> message = a -> "The animal " + a.name + " has " + a.age + " years and about the fur: " + a.furColor;

        animals.stream()
                .filter(noFur)
                .filter(age)
                .map(message)
                .forEach(System.out::println);

    }
}
