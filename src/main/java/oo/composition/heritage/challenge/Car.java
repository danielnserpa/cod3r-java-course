package oo.composition.heritage.challenge;

public class Car {

    int speed = 0;

    void accelerateCar (){
        this.speed  += 5;
    }

    @Override
    public String toString() {
        return "Car speed is " + speed + " km/h";
    }

    void breakCar (){
        this.speed  -= 5;

        if (speed < 5) {
            this.speed = 0;
            System.out.println("Your car is parked.");
        }
    }

}

