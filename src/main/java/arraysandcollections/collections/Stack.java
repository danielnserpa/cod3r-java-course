package arraysandcollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

    public static void main(String[] args) {

        // É mais recomendado usar Deque e ArrayDeque do que Stack por fatores de sincronizacao, fazendo com que Deque seja mais performatico.
        Deque<String> books = new ArrayDeque<>();

        books.add("O pequeno Principe");
        books.push("Don Quixote");
        books.push("O Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
//        System.out.println(books.pop());
//        System.out.println(books.remove());

//        books.size();
//        books.clear();
//        books.contains();

        System.out.println(books.isEmpty());
    }
}
