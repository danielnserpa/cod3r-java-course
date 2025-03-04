package oo.composition.polimorfism;

public class Lunch {
    public static void main(String[] args) {

        Person p1 = new Person(99.5);

        Food ingredient1 = new Rice(0.25);
        Food ingredient2 = new Beans(0.33);
        Food ingredient3 = new Icecream(0.5);

        System.out.println(p1.getWeight());

        p1.eat(ingredient1);
        p1.eat(ingredient2);
        p1.eat(ingredient3);

        System.out.println(p1.getWeight());

    }
}
