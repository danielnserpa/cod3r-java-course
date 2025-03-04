package oo.composition.abstractt;

public class Dog extends Mammal {

    @Override
    public String move() {
        return "Used paws to move";
    }

    @Override
    public String milk() {
        return "Yummy";
    }
}
