package oo.composition.heritage;

public class Game {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("P1 life: " + p1.life);

        p2.attack(p1);

        System.out.println("P1 life: " + p1.life);

        p1.walk(Direction.NORTH);
        p1.walk(Direction.NORTH);
        p1.walk(Direction.NORTH);
        p1.walk(Direction.EAST);
        p1.walk(Direction.NORTH);
        p1.walk(Direction.EAST);
        p1.walk(Direction.SOUTH);
        p1.walk(Direction.WEST);
        p1.walk(Direction.WEST);
        p1.walk(Direction.WEST);
        p1.walk(Direction.WEST);
        p1.walk(Direction.WEST);
        p1.walk(Direction.WEST);

        p2.x = p1.x;
        p2.y = p1.y;

        p2.attack(p1);

        System.out.println("P1 life: " + p1.life);

        Player h1 = new Hero();

        h1.x = p1.x;
        h1.y = p1.y;

        System.out.println("Hero life: " + h1.life);

        p2.attack(h1);

        System.out.println("Hero life: " + h1.life);

        Player m1 = new Monster();

        m1.x = h1.x;
        m1.y = h1.y;

        System.out.println("Monster life: " + m1.life);

        h1.attack(m1);
        h1.attack(m1);

        m1.attack(h1);
        m1.attack(h1);
        m1.attack(h1);

        System.out.println("Hero life: " + h1.life);
        System.out.println("Monster life: " + m1.life);

        Hero h2 = new Hero();

        System.out.println(h2.x);

        Hero h3 = new Hero(10, 10);

        System.out.println(h3.x);

        Monster m2 = new Monster();

        System.out.println(m2.x);


    }
}
