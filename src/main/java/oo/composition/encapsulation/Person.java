package oo.composition.encapsulation;

public class Person {

    private int age;
    private String name;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello " + getName() + " you're " + getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = Math.abs(age);
        if (age >= 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Not valid");
        }
    }
}
