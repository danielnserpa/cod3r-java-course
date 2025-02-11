package example;

public class Maths {

    static int count = 0;
    static final double PI = 3.14;

    static int square(int x){
        return x * x;
    }

    static double areaCircle(double radius) {
        return PI * Math.pow(radius, 2);

    }
}
