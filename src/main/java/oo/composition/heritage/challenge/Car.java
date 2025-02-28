package oo.composition.heritage.challenge;

public class Car {

    int speed = 0;

    void accelerateCar (){
        this.speed  += 5;
    }

    void breakCar (){
        this.speed  -= 5;

        if (speed <= 0) {
            this.speed = 0;
            System.out.println("Your car is parked.");
        }
    }

}

