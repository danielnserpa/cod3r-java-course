package oo.composition.heritage.challenge;

public class Fusca extends Car{

    void accelerateCar ( ){
        this.speed += 10;
    }

    void breakCar (){
        this.speed  -= 10;

        if (speed <= 0) {
            this.speed = 0;
            System.out.println("Your fusca is parked.");
        }
    }

    @Override
    public String toString() {
        return "Fusca speed is " + speed + " km/h";
    }


}
