package controlStructures;

public class SpecifiedBreak {
    public static void main(String[] args) {
       external: for (int i = 0; i < 3; i++) {
           internal: for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break internal;
                    // break external;
                }

                System.out.printf("[%d, %d]\n", i, j );

            }

        }
    }
}
