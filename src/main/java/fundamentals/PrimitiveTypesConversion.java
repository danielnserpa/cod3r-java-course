package fundamentals;

public class PrimitiveTypesConversion {
    public static void main(String[] args) {

        double d = 1; // Implicit conversion

        float f = (float) 1.93848; // Explicit conversion (CAST)

        int i = 4; // If I set i = 130, even with the casting, it's not going to work because byte can't hold values higher than 127
        byte b = (byte) i;

        double dx = 4.9999999999;
        int in = (int) dx;

        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        System.out.println(dx);
        System.out.println(in);
    }
}
