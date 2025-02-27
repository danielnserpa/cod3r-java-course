package oo.composition.heritage;

public class Player {

    int x = 5;
    int y = 5;
    int life = 100;


    void walk(Direction direction) {
        switch (direction) {
            case NORTH -> y--;
            case EAST -> x++;
            case SOUTH -> y++;
            case WEST -> x--;
        }
    }

     void attack (Player opponent) {
        int deltaX = Math.abs(x - opponent.x);
        int deltaY = Math.abs(y - opponent.y);

         if ((deltaX == 0 && deltaY == 1) || (deltaX == 0 && deltaY == 0)) {
             opponent.life -= 10;
         }
     }
}
