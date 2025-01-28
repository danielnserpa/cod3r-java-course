package fundamentals;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public double convertToC(double tempF) {

        return (tempF - 32) * 5.0/9.0;
    }

    public double convertToF(double tempC) {

        return (tempC * 9.0 / 5.0) + 32;
    }
    public static void main(String[] args) {

        CelsiusToFahrenheit converter = new CelsiusToFahrenheit();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to convert to C or F?");
        String answer = scanner.nextLine();

        System.out.println("How many degrees is it?");
        double secondAnswer = Double.parseDouble(scanner.nextLine());

        double temp;

        if (answer.equalsIgnoreCase("C")) {
            temp = converter.convertToC(secondAnswer);
        } else {
            temp = converter.convertToF(secondAnswer);
        }

        System.out.println(temp);


    }
}
