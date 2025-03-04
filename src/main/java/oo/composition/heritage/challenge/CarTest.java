package oo.composition.heritage.challenge;

public class CarTest {
    public static void main(String[] args) {


        Car c1 = new Car(120);
        Ferrari ferrari1 = new Ferrari(290);
        Car fusca1 = new Fusca(80);

        ferrari1.accelerateCar();

        System.out.println(ferrari1.speed);

        ferrari1.turnOnTurbo();
        ferrari1.accelerateCar();

        System.out.println(ferrari1.speed);

        ferrari1.turnOffTurbo();

        ferrari1.turnOnAir();
        ferrari1.accelerateCar();

        System.out.println(ferrari1.speed);

        ferrari1.turnOnTurbo();
        ferrari1.accelerateCar();

        System.out.println(ferrari1.speed);



    }
}
