package oo.composition;

public class Car {

    Engine eng = new Engine();

    void accelerate() {
        eng.injectionFactor += 0.4;
    }

    void breaking() {
        if (eng.injectionFactor > 0.5) {
            eng.injectionFactor -= 0.4;
        }
    }

        void start () {
            eng.startEngine = true;
        }

        void turnOff () {
            eng.startEngine = false;
        }

        boolean isOn () {
            return eng.startEngine;
        }
    }

