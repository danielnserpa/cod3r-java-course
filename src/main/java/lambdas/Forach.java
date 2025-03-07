package lambdas;


import java.util.Arrays;
import java.util.List;



public class Forach {
    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Ana", "Bia", "Carlos", "Gui");

        for(String aprovados: approved) {
            System.out.println(aprovados);
        }

        System.out.println("\nWith Lamba #01: ");
        approved.forEach(nome -> System.out.println(nome));

        System.out.println("\nWith Method reference #01: ");
        approved.forEach(System.out::println);

    }
}
