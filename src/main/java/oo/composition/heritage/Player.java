package oo.composition.heritage;

public class Player {

    int x;
    int y;

    public boolean walk(Direction direction) {
        switch (direction) {
            case NORTH -> y--;
            case EAST -> x++;
            case SOUTH -> y++;
            case WEST -> x--;
        }
        return true;
    }
}
