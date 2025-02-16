package arraysandcollections.arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos na turma? ");
        int alunos = scanner.nextInt();

        System.out.println("Quantas notas por alunos? ");
        int notas = scanner.nextInt();

        double[][] notasTurma = new double[alunos][notas];

        double totalNotas = 0;

        for (int i = 0; i < notasTurma.length; i++) {
            for (int j = 0; j < notasTurma[i].length ; j++) {

                System.out.printf("Qual a nota %d do aluno %d? ", i + 1, j +1);
                notasTurma[i][j] = scanner.nextDouble();

                totalNotas += notasTurma[i][j];

            }
        }

        double media = totalNotas / (alunos * notas);

        System.out.println(media);

        scanner.close();

    }
}
