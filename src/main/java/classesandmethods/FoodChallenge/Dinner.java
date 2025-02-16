package classesandmethods.FoodChallenge;

public class Dinner {

    public static void main(String[] args) {

        Person p1 = new Person("Daniel", 75);

        System.out.println("Customer: " + p1.name + "\nWeight before eating: " + p1.weight + "kg");

        Food f1 = new Food("Rice", 0.35);
        Food f2 = new Food("Chicken", 0.15);
        Food f3 = new Food("Lasagne", 0.565);
        Food f4 = new Food("Crisps", 0.287);

        System.out.println("\nFood: " + f1.name + ", weight: " + f1.weight + "kg");
        System.out.println("Food: " + f2.name + ", weight: " + f2.weight + "kg");
        System.out.println("Food: " + f3.name + ", weight: " + f3.weight + "kg");
        System.out.println("Food: " + f4.name + ", weight: " + f4.weight + "kg");

        double foodSum = f1.weight + f2.weight + f3.weight + f4.weight;

        System.out.println("Total food weight: " + foodSum + "kg");

        p1.eat(f1);
        p1.eat(f2);
        p1.eat(f3);
        p1.eat(f4);

        System.out.println("\nCustomer: " + p1.name + "\nWeight after eating: " + p1.weight + "kg");

    }
}
