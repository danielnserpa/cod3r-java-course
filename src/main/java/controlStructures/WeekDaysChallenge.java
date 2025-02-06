package controlStructures;

import java.util.Scanner;

public class WeekDaysChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Which day is today? Type exit to end the application");
            String day = scanner.nextLine();

            if (day.equalsIgnoreCase("sunday")) {
                System.out.println("1st day");
            } else if (day.equalsIgnoreCase("monday")) {
                System.out.println("2nd day");
            } else if (day.equalsIgnoreCase("tuesday")) {
                System.out.println("3rd day");
            } else if (day.equalsIgnoreCase("wednesday")) {
                System.out.println("4th day");
            } else if (day.equalsIgnoreCase("thursday")) {
                System.out.println("5th day");
            } else if (day.equalsIgnoreCase("friday")) {
                System.out.println("6th day");
            } else if (day.equalsIgnoreCase("saturday")) {
                System.out.println("7th day");
            } else if (day.equalsIgnoreCase("exit")){
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Not a valid day!" + "\n");
            }
        }

        scanner.close();

    }
}
