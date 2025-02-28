package oo.composition.heritage;

public class Monster extends Player{

    void attack (Player hero) {
        int deltaX = Math.abs(x - hero.x);
        int deltaY = Math.abs(y - hero.y);

        if ((deltaX == 0 && deltaY == 1) || (deltaX == 0 && deltaY == 0)) {
            hero.life -= 5;
        }
    }


}
