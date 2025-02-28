package oo.composition.heritage.challenge;

public class Car {

    int speed = 0;
    final int MAX_SPEED;

    Car(int maxSpeed) {
        MAX_SPEED = maxSpeed;
    }

    void accelerateCar () {
        if (speed + 5 > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += 5;
        }
    }

    @Override
    public String toString() {
        return "Car speed is " + speed + " km/h";
    }

    void breakCar (){
        speed  -= 5;

        if (speed < 5) {
           speed = 0;
            System.out.println("Your car is parked.");
        }
    }

}

