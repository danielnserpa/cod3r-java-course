    package fundamentals;

    import java.util.Scanner;

    public class CalculatorChallenge {

        public double add (double num1, double num2) {

            return num1 + num2;

        }

        public double subtract(double num1, double num2) {

            return num1 - num2;

        }

        public double multiply (double num1, double num2) {

            return num1 * num2;

        }

        public double divide (double num1, double num2) {

            return num1 / num2;

        }

        public double rest (double num1, double num2) {

            return num1 % num2;

        }
        public static void main(String[] args) {

            // Set 2 numbers, ask the user which operation he wants to make based on the symbol and execute it.

            CalculatorChallenge calculator = new CalculatorChallenge();
            Scanner scanner = new Scanner(System.in);

            boolean keepGoing = true;

                System.out.println("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = scanner.nextDouble();

                scanner.nextLine();

            while (keepGoing) {

                System.out.println("What operation do you want to do? (+ - * / %): ");
                String operation = scanner.nextLine();

                switch (operation) {
                    case "+" -> System.out.println("The sum between the 2 numbers is: " + calculator.add(num1, num2));
                    case "-" ->
                            System.out.println("The subtraction between the 2 numbers is: " + calculator.subtract(num1, num2));
                    case "*" ->
                            System.out.println("The multiplication between the 2 numbers is: " + calculator.multiply(num1, num2));
                    case "/" ->
                            System.out.println("The division between the 2 numbers is: " + calculator.divide(num1, num2));
                    case "%" ->
                            System.out.println("The rest between the 2 numbers' division is: " + calculator.rest(num1, num2));
                }

                System.out.println("\nDo you wish to continue the operations? ");
                String answer = scanner.nextLine();

                if (!answer.equalsIgnoreCase("yes")) {
                    keepGoing = false;
                    System.out.println("Bye :)");
                }
            }

                scanner.close();

        }
    }
