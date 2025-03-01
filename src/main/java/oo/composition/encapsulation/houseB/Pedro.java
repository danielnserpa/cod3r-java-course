package oo.composition.encapsulation.houseB;

import oo.composition.encapsulation.houseA.Ana;

public class Pedro extends Ana {

    Ana mom = new Ana();

    public void accessTrial () {

        // System.out.println(mom.secret);
       //  System.out.println(mom.doInMyHouse);
        System.out.println(wayOfSpeaking); // Nao precisa criar uma instancia para acessar, pois é acessado diretamente da heranca.
        System.out.println(mom.everyoneKnows); // No caso de ser publico, pode ser acessado por instancia ou diretamente por heranca.
    }
}
