package arraysandcollections.arrays;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        double[] grades = new double[3];

        grades[0] = 5.3;
        grades[1] = 7.7;
        grades[2] = 10;

        System.out.println(Arrays.toString(grades));

        // Another way to initialize an array --- Less used
        double nota = 7.7;
        double[] price = { 5.5, 6.3, 7.8, 9.4, 3.0, nota };

        System.out.println(Arrays.toString(price));

    }
}
