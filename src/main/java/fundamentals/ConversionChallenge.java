package fundamentals;

import java.util.Scanner;
public class ConversionChallenge {
    public static String isValid (Scanner scanner, String message, String regex) {
        String input;

        do {
            System.out.println(message);
            input = scanner.nextLine();
            if (!input.matches(regex)) {
                System.out.println("Invalid input");
            }
        } while (!input.matches(regex));
        return input;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String validNumberRegex = "^[0-9]+([.,][0-9]+)?$";

        String wage1 = isValid(scanner, "What's your last payment? ", validNumberRegex);
        String wage2 = isValid(scanner, "What's your second to last payment? ", validNumberRegex);
        String wage3 = isValid(scanner, "What's your third to last payment? ", validNumberRegex);

        double salary1 = Double.parseDouble(wage1.replace(",", "."));
        double salary2 = Double.parseDouble(wage2.replace(",", "."));
        double salary3 = Double.parseDouble(wage3.replace(",", "."));
        double average = (salary1 + salary2 + salary3) / 3;

        System.out.printf("Your average salary considering your 3 last payments is: %.2f%n", average);
        scanner.close();
    }
}


// First try

// public static void main(String[] args) {
//        // Criar 3 entradas de String usando next line. Sao 3 salarios e quero calcular as medias do funconario. Pode dividir as casas decimais com , ou .
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What's your last wage? ");
//        String wage1 = scanner.nextLine();
//
//        System.out.println("What's your second to last wage? ");
//        String wage2 = scanner.nextLine();
//
//        System.out.println("What's your third to last wage? ");
//        String wage3 = scanner.nextLine();
//
//        String validNumberRegex = "^[0-9]+([.,][0-9]+)?$";
//
//        if (wage1.matches(validNumberRegex) && wage2.matches(validNumberRegex) && wage3.matches(validNumberRegex)) {
//            double salary1 = Double.parseDouble(wage1.replace(",", "."));
//            double salary2 = Double.parseDouble(wage2.replace(",", "."));
//            double salary3 = Double.parseDouble(wage3.replace(",", "."));
//
//            System.out.println(salary1);
//            System.out.println(salary2);
//            System.out.println(salary3);
//
//            double average = ((salary1 + salary2 + salary3) / 3 );
//
//            System.out.println(average );
//        } else {
//            System.out.println("Invalid input");
//
//        }
// }

