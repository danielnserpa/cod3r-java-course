package generics;

public class BoxObject {

    private Object thing;

    public void insert (Object thing) {
        this.thing = thing;

    }

    public Object open () {
        return thing;
    }
}
