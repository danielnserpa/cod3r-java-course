package oo.composition.encapsulation.houseB;

import oo.composition.encapsulation.houseA.Ana;

public class Julia {

    Ana motherInLaw = new Ana();

    public void accessTrial() {

        // System.out.println(motherInLaw.secret);
        // System.out.println(motherInLaw.doInMyHouse);
        // System.out.println(motherInLaw.wayOfSpeaking);
        System.out.println(motherInLaw.everyoneKnows);
    }
}
