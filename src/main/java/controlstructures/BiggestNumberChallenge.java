package controlstructures;

import java.util.Scanner;

public class BiggestNumberChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number");
        int biggestNumber = scanner.nextInt();

        for (int i = 1; i < 10; i++) {

            System.out.println("Choose a number");
            int number = scanner.nextInt();

            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println("The biggest added number is: " + biggestNumber);
        scanner.close();
    }
}
