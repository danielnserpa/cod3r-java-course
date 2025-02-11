package classesAndMethods;

public class Product {

    // Alterar a classe produto para 25% de desconto.
    // Quando um desconto é aplicado para um produto, todos recebem o mesmo desconto
    // O desconto é25%, mas podemos mudar para 30, 35% e varia para todos os produtos igualmente

    String name;
    double price;
    static double discount = 0.25;


    double discountedPrice (){
        return price * (1 - discount);
    }
    double discountedPrice (double price, double discount) {
        return price * (1 - discount);
    }
}
