package oo.composition.heritage.challenge;

public class Ferrari extends Car {

    @Override
    void accelerateCar (){
        this.speed += 15;
    }
    @Override
    void breakCar (){
        this.speed  -= 15;

        if (speed <= 0) {
            this.speed = 0;
            System.out.println("Your ferrari is parked.");
        }
    }

    @Override
    public String toString() {
        return "Ferrari speed is " + speed + " km/h";
    }
}
