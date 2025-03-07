package lambdas;


import arraysandcollections.arrays.Foreach;

import java.util.Arrays;
import java.util.List;



public class Forach {

    static void print(String name) {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Ana", "Bia", "Carlos", "Gui");

        for(String aprovados: approved) {
            System.out.println(aprovados);
        }

        System.out.println("\nWith Lamba #01: ");
        approved.forEach(aprovados -> System.out.println(aprovados));

        System.out.println("\nWith Lamba #02: ");
        approved.forEach(aprovados -> print(aprovados));

        System.out.println("\nWith Method reference #01: ");
        approved.forEach(System.out::println);

        System.out.println("\nWith Method reference #02: ");
        approved.forEach(Forach::print);

    }
}
