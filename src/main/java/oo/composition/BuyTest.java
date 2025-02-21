package oo.composition;

public class BuyTest {
    public static void main(String[] args) {

        Buy b1 = new Buy();

        b1.client = "Daniel";

        b1.itens.add(new Item("Pen", 25, 1.20));
        b1.itens.add(new Item("Paint", 13, 2.50));
        b1.itens.add(new Item("Sharpener", 2, 8.45));

        System.out.println(b1.itens.size());

        System.out.println(b1.getTotalValue());

        System.out.println(b1.itens);

        System.out.println(b1);
    }
}
