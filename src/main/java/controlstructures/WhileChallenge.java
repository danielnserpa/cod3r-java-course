package controlstructures;

import java.util.Scanner;

public class WhileChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me something: ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("exit")) {
            System.out.println("Bye :)");
        } else {
            System.out.println(answer);

            while (!answer.equalsIgnoreCase("exit")) {
                System.out.println("\n" + "What else do you want to say? ");
                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("exit")) {
                    System.out.println("Bye :)");
                } else {
                    System.out.println(answer);
                }
            }
            scanner.close();
        }
    }
}
