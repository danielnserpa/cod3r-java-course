package oo.composition;

public class Engine {

    boolean startEngine = false;
    double injectionFactor = 1.5;

    int rpm() {
        if (!startEngine) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }
}
