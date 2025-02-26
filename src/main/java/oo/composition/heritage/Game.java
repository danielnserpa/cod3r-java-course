package oo.composition.heritage;

public class Game {
    public static void main(String[] args) {

        Player p1 = new Player();

        p1.walk(Direction.NORTH);
        p1.walk(Direction.NORTH);
        p1.walk(Direction.NORTH);
        p1.walk(Direction.EAST);
        p1.walk(Direction.NORTH);
        p1.walk(Direction.EAST);
        p1.walk(Direction.SOUTH);
        p1.walk(Direction.WEST);

        System.out.println(p1.y);
        System.out.println(p1.x);
    }
}
