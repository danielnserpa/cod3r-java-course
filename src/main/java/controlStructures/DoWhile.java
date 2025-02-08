package controlStructures;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        boolean finished;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Tell me the first country that comes to your mind");
            String answer = scanner.nextLine();


            if (answer.equalsIgnoreCase("exit")) {
                finished = false;
                System.out.println("\nBye");
            } else {
                finished = true;
                System.out.println("I know this country: " + answer + "\n");
            }
        } while (finished);
    }
}
