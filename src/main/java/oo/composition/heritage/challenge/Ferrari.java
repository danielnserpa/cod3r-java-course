package oo.composition.heritage.challenge;

public class Ferrari extends Car {

    Ferrari(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    void accelerateCar () {
        if (speed + 5 > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += 15;
        }
    }
    @Override
    void breakCar (){
        speed  -= 15;

        if (speed <= 0) {
            speed = 0;
            System.out.println("Your ferrari is parked.");
        }
    }

    @Override
    public String toString() {
        return "Ferrari speed is " + speed + " km/h";
    }
}
