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


    public static class CarTest {

        public static void main(String[] args) {
            Car car1 = new Car(15);
            Car ferrari1 = new Ferrari(400);
            Car fusca1 = new Fusca(50);

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            car1.accelerateCar();
            ferrari1.accelerateCar();
            fusca1.accelerateCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);



            System.out.println("Start breaking...");

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);

            car1.breakCar();
            ferrari1.breakCar();
            fusca1.breakCar();

            System.out.println(car1);
            System.out.println(ferrari1);
            System.out.println(fusca1);





        }



    }
}
