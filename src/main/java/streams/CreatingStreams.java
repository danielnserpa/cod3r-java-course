package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "JavaScript ", "Go\n");
        langs.forEach(print);

        // Outra forma de criar uma Stream é a partir de um Array
        String[] moreLangs = {"Python ", "C# ", "C++ ", "JS\n"};
        Stream.of(moreLangs).forEach(print);

        //Outra forma de criar uma Stream é a partir da classe Arrays
        Arrays.stream(moreLangs).forEach(print);
        // Posso escolher quais elementos printar. Nesse caso printa do indice 1 ao indice 3, sem incluir o indice 3
        Arrays.stream(moreLangs, 1, 3).forEach(print);

        // Outra forma é a partir das collections

        List<String> otherLangs = Arrays.asList("Kotlin ", "PHP\n");
        otherLangs.stream().forEach(print);
        otherLangs.parallelStream().forEach(print);

        // Para gerar uma Stream de forma infinita
//        Stream.generate(() -> "a").forEach(print);
        // OU
        // Stream.iterate(0, n -> n +1).forEach(print);



    }
}
