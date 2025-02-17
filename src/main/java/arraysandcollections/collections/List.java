package arraysandcollections.collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("Divaldo");

        list.add(u1);
        list.add(new User("Claudio"));
        list.add(new User("Rob"));
        list.add(new User("Ana"));
        list.add(new User("Dinho"));
        list.add(new User("Connor"));

        for (User people : list) {
            System.out.println(people.name);
        }

        //Se eu coloco sout (list.get(index)), vai me retornar o endereco de memoria do objeto de index 4. SE NAO TIVER O METODO TOSTRING
//        System.out.println(list.get(4));

        // Preciso especificar que quero printar o nome de tal objeto SOMENTE SE NAO TIER O METODO TOSTRING
        System.out.println("Name on index 5: " + list.get(5).name);

        list.remove(5);

        // Agora ao inves de printar os enderecos de memoria, vai printar os nomes na arraylist porque foi criado o metodo toString
        System.out.println(list);

        //Vai dar false pq está procurando se "list" contem uma String "Dinho", mas na verdade, contem um Objeto "User" chamado "Dinho"
        System.out.println(list.contains("Dinho"));
        // Da pra usar o contains se o usuario for criado igual o u1 e adicionado na lista
        System.out.println(list.contains(u1));
        // Mostrando como tem que ser colocado para ver se contem um objeto de tipo especifico.
        System.out.println(list.contains(new User("Dinho")));





    }
}
