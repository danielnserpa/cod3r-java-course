package classesandmethods;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto p1 = new Produto("Computador", 5000, 450);

        Produto p2 = new Produto("TV", 2000, 200);

        Produto p3 = new Produto("Speaker", 250, 33);

        System.out.printf("%s %.2f %.2f", p1.nome, p1.preco, p1.desconto);


        // Different ways to print the final price with discount. First calling a method without parameters using the variables.
        // Second calling the method with parameters and assigning the discounted price to a variable
        // Third calling the method with parameters directly with the parameters without using a variable

        double p1Final = p1.produtoComDesconto();
        System.out.printf("\n%s %.2f", p1.nome, p1Final);

        double p2Final = p2.produtoComDescontoParam(p2.preco, p2.desconto);
        System.out.printf("\n%s %.2f", p2.nome, p2Final);

//        double p3Final = p3.produtoComDescontoParam(p3.preco, p3.desconto);
        System.out.printf("\n%s %.2f", p3.nome, p3.produtoComDescontoParam(p3.preco, p3.desconto));
    }
}
