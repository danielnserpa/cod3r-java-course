package oo.composition.heritage.challenge;

public class Fusca extends Car{

    public Fusca(int maxSpeed) {
        super(maxSpeed);
    }
    @Override
    public void accelerateCar ( ){
        if (speed + 5 > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += 10;
        }
    }
    @Override
    public void breakCar (){
        speed  -= 10;

        if (speed <= 0) {
           speed = 0;
            System.out.println("Your fusca is parked.");
        }
    }

    @Override
    public String toString() {
        return "Fusca speed is " + speed + " km/h";
    }


}
