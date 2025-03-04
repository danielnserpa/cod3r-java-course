package oo.composition.encapsulation.houseB;

import oo.composition.encapsulation.Person;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person("Daniel", -145);

        System.out.println(p1.getAge());

        p1.setAge(45);

        System.out.println(p1.getAge());

        System.out.println(p1);


    }
}
