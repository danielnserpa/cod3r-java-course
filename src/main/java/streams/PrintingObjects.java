package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintingObjects {

    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Ana", "Pedro", "Lucas", "Gui");

        for (int i = 0; i < approved.size(); i++) {
            System.out.println(approved.get(i));
        }

        System.out.println(" ");

        Iterator<String> iterator = approved.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        Stream<String> stream = approved.stream();
        stream.forEach(System.out::println);




    }
}
