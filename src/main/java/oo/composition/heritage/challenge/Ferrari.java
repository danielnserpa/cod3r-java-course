package oo.composition.heritage.challenge;

public class Ferrari extends Car implements Luxury, Sports {

    private boolean isTurboOn = false;
    private boolean isAirOn = false;

    public Ferrari(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerateCar() {
        int delta = 15;

        if (isTurboOn && isAirOn) {
            delta = 20;
        } else if (isAirOn) {
            delta = 10;
        } else if (isTurboOn) {
            delta = 25;
        }

        if (speed + delta > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += delta;
        }
    }

    @Override
    public void breakCar() {

        speed -= 15;
        if (speed <= 0) {
            speed = 0;
            System.out.println("Your ferrari is parked.");
        }
    }

    @Override
    public String toString() {
        return "Ferrari speed is " + speed + " km/h";
    }

    @Override
    public void turnOnAir() {
        isAirOn = true;

    }

    @Override
    public void turnOffAir() {
        isAirOn = false;
    }

    @Override
    public void turnOnTurbo() {
        isTurboOn = true;
    }

    @Override
    public void turnOffTurbo() {
        isTurboOn = false;
    }
}
