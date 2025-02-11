package classesAndMethods;

public class DateTest {

    public static void main(String[] args) {

        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date(23, "april", 1984);

        d1.day = 22;
        d1.month = "feb";
        d1.year = 1995;

        d2.day = 11;
        d2.month = "march";
        d2.year = 1997;

        System.out.println(d1.day + " " +  d1.month + " " + d1.year);
        System.out.printf("%d %s %d", d1.day, d1.month, d1.year);

        System.out.println("\n" + d2.day + " " + d2.month + " " + d2.year);
        System.out.printf("%d %s %d", d2.day, d2.month, d2.year);


        System.out.println("\n" + d3.day + " " + d3.month + " " + d3.year);
        System.out.printf("%d %s %d", d3.day, d3.month, d3.year);


    }
}
