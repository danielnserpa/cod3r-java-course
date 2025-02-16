package classesandmethods;

public class Equals {

    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "Daniel Nascimento";
        u1.email = "danielnserpa@live.com";

        User u2 = new User();
        u2.name = "Daniel Nascimento";
        u2.email = "danielnserpa@live.com";

        System.out.println(u1==u2);

        System.out.println(u1.equals(u2));


    }
}
