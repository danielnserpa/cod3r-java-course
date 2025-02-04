package fundamentals;

public class ArithmeticChallenge {
    public static void main(String[] args) {


        // First try

//        int x = 2 * 3;
//        int y = (int) Math.pow(x, 3);
//
//        System.out.println(y);
//
//        int a = 6 * ( 3 + 2);
//        int b = (int) Math.pow(a, 2);
//        int c = b / (3 * 2);
//
//        System.out.println("C " + c);
//
//
//        int d = (1 - 5) * ( 2 - 7) / 2;
//        int e = (int) Math.pow(d, 2);
//
//        System.out.println("E " + e);
//
//        int f = c - e;
//        int g = (int) Math.pow(f, 3);
//
//        System.out.println("F " + f);
//
//        System.out.println("G " + g);
//
//        int h = g / (int) Math.pow(10, 3);
//
//        System.out.println(h);

        // Second try

        int a = (int) Math.pow(6 * (3 + 2), 2);
        int a1 = a / (3 * 2);

        System.out.println(a1);

        int b = (int) Math.pow((((1 - 5) * (2 - 7)) / 2.0), 2);

        System.out.println(b);

        int c = (int) Math.pow((a1 - b), 3);

        System.out.println(c);

        int d =  c / (int) Math.pow(10, 3);

        System.out.println("Result" + d);





    }
}
