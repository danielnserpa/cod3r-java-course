package generics;

public class BoxObjectTest {

    public static void main(String[] args) {

        BoxObject box1 = new BoxObject();

        box1.insert(5.5);

        Double thing = (Double) box1.open();
        System.out.println(thing);

        BoxObject box2 = new BoxObject();

        box2.insert("Hello");

        String thing2 = (String) box2.open();
        System.out.println(thing2);
    }
}
