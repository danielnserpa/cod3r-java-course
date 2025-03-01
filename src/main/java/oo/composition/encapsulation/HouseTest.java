package oo.composition.encapsulation;

import oo.composition.encapsulation.houseA.Ana;
import oo.composition.encapsulation.houseA.Paulo;
import oo.composition.encapsulation.houseB.Julia;
import oo.composition.encapsulation.houseB.Pedro;

public class HouseTest {
    public static void main(String[] args) {

        Julia julia = new Julia();
        Pedro pedro = new Pedro();
        Paulo paulo = new Paulo();
        Ana ana = new Ana();

        julia.accessTrial();
        pedro.accessTrial();
        paulo.accessTrial();
        ana.accessTrial();




    }
}
