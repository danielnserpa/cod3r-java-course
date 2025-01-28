package fundamentals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysCounter {

    public static void main(String[] args) {

        // set initial date
        LocalDate creationDate = LocalDate.of(2025, 1, 27);
        // retrieve today's date
        LocalDate today = LocalDate.now();
        // calculate difference between today's date and creation date
        long daysPassed = ChronoUnit.DAYS.between(creationDate, today);

        System.out.println("You started counting the days on " + creationDate);
        System.out.println("It's been " + daysPassed + " days since you started counting");

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Have you found a job yet? Y/N");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println("Invalid input, try again");
            answer = scanner.nextLine();
        }

        if (answer.equalsIgnoreCase("n")) {
            System.out.println("You have been looking for jobs for " + daysPassed + " days");
        } else {
            System.out.println("Congratulations, you found a job");
        }

        scanner.close();

    }
}






