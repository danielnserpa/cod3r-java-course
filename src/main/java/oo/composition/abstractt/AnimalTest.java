package oo.composition.abstractt;

public class AnimalTest {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        System.out.println(d1.milk());
        System.out.println(d1.move());
        System.out.println(d1.breathe());
    }

}
