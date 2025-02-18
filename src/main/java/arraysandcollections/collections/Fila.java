package arraysandcollections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();


        //Add e Offer adicionam elementos. Quando a fila está cheia, add joga uma excecao e offer retorna um boolean (falso).
        // Add --> Lanca uma excecao
        // Offer --> Retorna false
        queue.add("Ana");
        queue.offer("Bia");
        queue.add("Carlos");
        queue.offer("Daniel");
        queue.add("Rafaela");
        queue.offer("Guilherme");
        queue.add("Tiao");

        // Se a fila estiver vazia, peek retorna null e element retorna NoSuchElementException
        // Peek --> Retorna null
        // Element --> Lanca uma excecao
        System.out.println(queue.peek());
        System.out.println(queue.element());

        //Checa tamanho da fila
//        queue.size();
        // Limpa a fila
//        queue.clear();
        // Checa se a fila está vazia
//        queue.isEmpty();

        // Pool Pega o primeiro elemento da fila, retorna-o e remove ele da fila. Se a fila esta vazia, retorna false
        // Remove remove o primeiro elemento da fila. Se a fila está vazia, lanca uma excecao.
        // Pool --> Retorna false
        // Remove --> Lanca excecao
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue.size());
        System.out.println(queue.poll());

        System.out.println(queue.size());


    }
}
