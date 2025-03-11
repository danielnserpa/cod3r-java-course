package lambdas.challenge;

import lambdas.Product;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChallengeByTeacher {
    public static void main(String[] args) {

         /*
        1. From the product, calculate the actual price with discount.
        2. Municipal Tax - If the product's price is >= 2500, apply 8.5%. If it's < 2500, it's exempt from tax.
        3. Shipping - If the price is >= 3000, shipping is 100. If it's < 3000, shipping is 50.
        4. Round to two decimal places.
        5. Format to €1234.56.
        */

        Function<Product, Double> finalPrice =
                p -> p.price * (1 - p.discount);
        UnaryOperator<Double> municipalTaxes =
                price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> shipping =
                price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> twoDecimals =
                price -> Double.parseDouble(String.format("%.2f", price));
        Function<Double, String> format =
                price -> ("€" + price).replace('.', ',');

        Product p = new Product("Apple Watch", 3200.0, 0.13);

        String price = finalPrice
                .andThen(municipalTaxes)
                .andThen(shipping)
                .andThen(twoDecimals)
                .andThen(format)
                .apply(p);

        System.out.println("The final price is " + price);

    }
}
