package classesandmethods;

public class ValueVsReference {
    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuicao por valor pois sao tipos primitivos

        a++;
        b--;

        System.out.println(a + " " + b );

        Date d1 = new Date(1, 6, 2022);
        Date d2 = d1; // atribuicao por referencia pois é objeto

        d1.day = 31;
        d2.month = 12;

        System.out.println(d1.formattedDate());
        System.out.println(d2.formattedDate());

        backToInitialDate(d1);

        System.out.println(d1.formattedDate());
        System.out.println(d2.formattedDate());

        // Por conta de ter atribuido d2 = d1 no inicio, eles apontam pro mesmo local de memoria. Modificando um, o outro é modificado automaticamente.
    }

    static void backToInitialDate(Date d) {
        d.day = 1;
        d.month = 1;
        d.year = 1970;
    }
}
