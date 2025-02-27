package oo.composition.heritage;

public class Game {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        p2.attack(p1);

        System.out.println(p1.life + "\n");

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

        System.out.println(p1.life + "\n");

        Player h1 = new Hero();

        h1.x = p1.x;
        h1.y = p1.y;

        p2.attack(h1);

        System.out.println(h1.life);

    }
}
