package classesAndMethods;

public class AreaTest {
    public static void main(String[] args) {

        //Como o valor de pi foi definido como static na classe, quando eu uso a1.pi ou a2.pi, o que esta fazendo na verdade é
        // Area.pi = x; ou seja, o último valor de pi vai ser considerado para as duas chamadas de métodos no sout.
        // O valor está sendo mudado para a classe como um
        // todo e consequentemente, sendo passado pros objetos criados (nao sei pq esta digitado em amarelo).


        //Se eu deixar a variável pi na classe AREA como sendo final static, eu nao consigo definir outros valores pra ela nessa outra classe.
        // Por isso eu comentei as atribucoes de valores para pi

        Area a1 = new Area(10);
//        a1.pi = 10;

        Area a2 = new Area(5);
//        a2.pi = 50000;

        // Aqui é como deveria ser feito caso eu quisesse mudar o valor de pi sendo static. Acessando e mudando a variável diretamente
        // dentro da classe. E como foi a última declaracao da modificacao de Pi, ele vai ser considerado nas duas chamadas.
//        Area.pi = 3.14;

        System.out.println(a1.areaCirc());
        System.out.println(a2.areaCirc());

        // Mostrando mais uma vez o que o comment acima esta dizendo. O primeiro sout é o correto. O segundo é errado, mas so para demonstrar que
        // é "a mesma coisa".
        System.out.println(Area.PI);
        System.out.println(a1.PI);


    }
}
