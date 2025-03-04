package oo.composition.polimorfism;

public class Food {

    private double weight;

    Food (double weight){
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
