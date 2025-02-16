package controlstructures;

import java.util.Scanner;

public class WhileSecondChallenge {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int totalNumber = 0;
        
        while (true) {
            System.out.println("Choose a number");
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                totalNumber += number;                
                }
            else {
                break;
            }
            
        }

        System.out.println("Total sum of the added numbers is: " + totalNumber);
        
        scanner.close();
    }
}
