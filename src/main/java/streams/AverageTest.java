package streams;

import streams.FilterChallenge.Average;

public class AverageTest {
    public static void main(String[] args) {

        Average a1 = new Average()
                .add(8.7)
                .add(8.4)
                .add(9.2);

        System.out.println(a1.getAverage());

        Average a2 = new Average()
                .add(7.2)
                .add(6.9)
                .add(5.4);

        System.out.println(a2.getAverage());

        System.out.println(Average.combine(a1, a2).getAverage());

    }

}
