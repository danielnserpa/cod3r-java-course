package oo.composition.encapsulation.houseA;

public class Ana {

    private String secret = "I don't shower at night";
    String doInMyHouse = "I clean"; // package/default
    protected String wayOfSpeaking = "Sometimes I'm mad";
    public String everyoneKnows = "I'm married to Paulo";

    public void accessTrial() {

        System.out.println(secret);
        System.out.println(doInMyHouse);
        System.out.println(wayOfSpeaking);
        System.out.println(everyoneKnows);


    }
}
