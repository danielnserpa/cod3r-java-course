package classesAndMethods.FoodChallenge;

public class Person {

    String name;
    double weight;

    // Criar pessoa: nome, peso
    // Metodo comer: recebe como parametro um objeto da classe comida (que vai ter nome e peso). Quando passar o peso da comida que a pessoa comeu, vai acrescentar
    // O peso da comida no peso da pessoa. A pessoa ganha peso conforme for comendo

    // Dinner -> psvm e cria instancias de comida.

    Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat(Food food) {
        this.weight += food.weight;
    }
}
