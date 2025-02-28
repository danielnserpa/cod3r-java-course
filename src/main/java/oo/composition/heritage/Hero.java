package oo.composition.heritage;

public class Hero extends Player{

    void attack (Player monster) {
        int deltaX = Math.abs(x - monster.x);
        int deltaY = Math.abs(y - monster.y);

        if ((deltaX == 0 && deltaY == 1) || (deltaX == 0 && deltaY == 0)) {
            monster.life -= 20;
        }
    }


}
