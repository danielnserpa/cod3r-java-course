package oo.composition;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println(car1.isOn());

        car1.start();

        System.out.println(car1.isOn());

        System.out.println(car1.eng.rpm());

        car1.accelerate();
        car1.accelerate();
        car1.accelerate();

        System.out.println(car1.eng.rpm());

        car1.breaking();
        car1.breaking();
        car1.breaking();
        car1.breaking();
        car1.breaking();
        car1.breaking();
        car1.breaking();

        // Faltou encapsulamento!!!! Por isso eu consigo setar o valor e isso daria um erro no valor final. Nao tem como injection ser -30 na realidade.
//        car1.eng.injectionFactor = -30;

        System.out.println(car1.eng.rpm());
    }
}
