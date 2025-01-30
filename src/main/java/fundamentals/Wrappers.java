package fundamentals;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;

        // I can initiate i as an Integer value
        // Integer i = 1000;

        // I can convert a string to an int value
        Integer i = Integer.parseInt("1000");
        Long l = 100000L;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What value do you want?");

        // I can change the value of i based on the input. The value entered would be "a string" and gets converted to int.
        i = Integer.parseInt(scanner.nextLine());

        // I could directly enter as int
        // i = scanner.nextInt();

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);

        scanner.close();

        Float f = 123.1054F;
        System.out.println(f);
        // To print float with specific amount of decimals
        System.out.printf("%.1f%n", f);

        Double d = 1234.56678;
        System.out.println(d);
        // To print double with specific amount of decimals.
        //PRINTF MEANS PRINT FORMATTED
        System.out.printf("%.1f%n", d);

        // Converts a String in Boolean object. Aranha  is !true, so == false
        Boolean bo = Boolean.parseBoolean("aranha");
        System.out.println(bo);
        // Converts bo to String and to Upper Case, which will output FALSE
        System.out.println(bo.toString().toUpperCase());

        // char
        Character c = '#';
        System.out.println(c);



    }
}