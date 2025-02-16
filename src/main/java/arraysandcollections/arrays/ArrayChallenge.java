package arraysandcollections.arrays;

import java.util.Scanner;

public class ArrayChallenge {

    // Calcular a media de notas
    // User input - Quantas notas vc quer informar?
    // Criar um array om notas posicoes

    // Primeiro for loop vai armazenar notas no array

    // Segundo for loop vai somar todas as notas e achar a media

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many grades do you want to add? ");
        int num = scanner.nextInt();

        double[] grades = new double[num];

        for (int i = 0; i < grades.length; i++){
            System.out.println("Enter grade " + (i +1) + ":");
            grades[i] = scanner.nextDouble();
        }

       double sum = 0;

        for (double grade : grades) {
            sum+= grade;
        }

        double avg = sum / grades.length;

        System.out.printf("The entered grades' average is: %.2f", avg);

        scanner.close();
    }
}
