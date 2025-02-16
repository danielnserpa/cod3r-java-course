package controlstructures;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your Jiu Jitsu belt? ");
        String belt = scanner.nextLine();

        switch (belt) {
            case "black":
                System.out.println("Wow, you're a master!");
                break;
            case "brown":
                System.out.println("You're pretty good yea?");
                break;
            case "purple":
                System.out.println("You're getting there...");
                break;
            case "blue":
                System.out.println("Keep going buddy!");
                break;
            case "green":
                System.out.println("Are you a kid?");
                break;
            case "yellow":
                System.out.println("Very goof start!");
                break;
            case "white":
                System.out.println("Don't give up!");
                break;
            default:
                System.out.println("That's not a belt");

        }

        System.out.println("\nWhat's your grade? 1-10");
        String grade = scanner.nextLine();

        switch (grade) {
            case "10": case "9": case "8":
                System.out.println("1:1");
                break;
            case "7": case "6": case "5":
                System.out.println("2:1");
                break;
            case "4": case "3":
                System.out.println("3:1");
                break;
            case "2": case "1": case "0":
                System.out.println("4:1");
                break;
            default:
                System.out.println("Not valid");
                break;
        }


scanner.close();
    }
}


