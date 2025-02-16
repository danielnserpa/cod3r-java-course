package controlstructures;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your grade? ");
        double grade = scanner.nextDouble();

        if (grade >= 0 && grade < 5) {
            System.out.println("Failed");
        } else if (grade >= 5 && grade <= 7.5) {
            System.out.println("Pass");
        } else {
            System.out.println("Pass with honors");
        }
    }
}


