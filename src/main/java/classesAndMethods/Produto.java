package classesAndMethods;

public class Produto {

    String nome;
    double preco;
    double desconto;

public Produto(String nome, double preco, double desconto) {
    this.nome = nome;
    this.preco = preco;
    this.desconto = desconto;

}

double produtoComDesconto() {

    return preco - desconto;
}

double produtoComDescontoParam(double preco, double desconto) {

    return preco - desconto;
}

}
