package arraysandcollections.arrays;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = {9.4, 8.7, 9.5, 7.2};

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        for (double nota: notas) {
            System.out.println(nota + "/");
        }
    }
}
