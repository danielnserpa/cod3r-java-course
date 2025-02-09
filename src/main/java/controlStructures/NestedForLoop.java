package controlStructures;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d] [%d]\n", i, j);
            }

        }
    }
}
