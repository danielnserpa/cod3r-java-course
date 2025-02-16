package arraysandcollections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos pratos tem no restaurante?");
        int pratos = scanner.nextInt();

        System.out.println("Quantos ingredientes tem cada prato?");
        int ingredientes = scanner.nextInt();

        double[][] ingredientesDosPratos = new double[pratos][ingredientes];

        double totalPreco = 0;

        for (int p = 0; p < ingredientesDosPratos.length ; p++) {
            for (int i = 0; i < ingredientesDosPratos[p].length; i++) {

                System.out.printf("Qual o preco do ingrediente %d do prato %d? ", i + 1, p + 1);
                ingredientesDosPratos[p][i] = scanner.nextDouble();

                totalPreco += ingredientesDosPratos[p][i];
            }
        }

        double mediaPreco = totalPreco / (pratos * ingredientes);

        System.out.println(mediaPreco);

        for (double[] ingrediente : ingredientesDosPratos) {
            System.out.println(Arrays.toString(ingrediente));
        }

        scanner.close();
    }
}
