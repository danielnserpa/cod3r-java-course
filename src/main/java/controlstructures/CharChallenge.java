package controlstructures;


import java.util.Scanner;


public class CharChallenge {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a word");
       String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));

        }

       scanner.close();

    }
}
