package arraysandcollections.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();

        // Adiciona e/ou faz update
        users.put(1, "Roberto");
        users.put(20, "Rebeca");
        users.put(30, "Rafaela");
        users.put(4, "Dani");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        // Printa as chaves dos objetos, mas sem ordenacao.
        System.out.println(users.keySet());
        // Printa os valores, mas sem ordenacao.
        System.out.println(users.values());
        // Printa as duas coisas, mas sem ordenacao
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(20));
        System.out.println(users.containsKey(40));

        System.out.println(users.get(4));

        // Da para remover um usuario pela key
        System.out.println("LOUCURA " + users.remove(20));
        // Tambem da pra remover um usuario pela key e pelo valor. Se o valor nao bater com a key, retorna falso
        System.out.println("VIAJANDO " + users.remove(20, "Gui"));

        //Da para percorrer os valores de um Map so pela chave, so pelos valores ou pelos 2

        for (int chave : users.keySet()) {
            System.out.println(chave);
        }

        for (String valor : users.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro : users.entrySet()) {
            System.out.println(registro);
            ///Tambem pode fazer dessa forma abaixo:
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }






    }
}
