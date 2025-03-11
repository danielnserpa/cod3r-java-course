package lambdas.challenge;

import lambdas.Product;

import java.util.function.UnaryOperator;

public class Challenge {
    public static void main(String[] args) {

      /*
        1. From the product, calculate the actual price with discount.
        2. Municipal Tax - If the product's price is >= 2500, apply 8.5%. If it's < 2500, it's exempt from tax.
        3. Shipping - If the price is >= 3000, shipping is 100. If it's < 3000, shipping is 50.
        4. Round to two decimal places.
        5. Format to €1234.56.
        */

        System.out.println("PRODUCT 1: " +"\n");

        Product product1 = new Product("Laptop", 3500, 0.13);

        UnaryOperator<Product> priceWithDiscount = product -> new Product(product.name, product.price * (1 - product.discount), product.discount);

        Product laptopDiscountedPrice = priceWithDiscount.apply(product1);
        System.out.println("Your " + laptopDiscountedPrice.name + " price with discount is " + String.format("%.2f", laptopDiscountedPrice.price) );

        double taxRate = 8.5/100;
        UnaryOperator<Product> isTaxes = product -> {
            if (product.price >= 2500) {
                return new Product(product.name, product.price * (1 + taxRate), product.discount);
            } else {
                return new Product(product.name, product.price, product.discount);
            }
        };

        laptopDiscountedPrice = priceWithDiscount.andThen(isTaxes).apply(product1);
        System.out.println("Your " + laptopDiscountedPrice.name + " price after taxes is " + String.format("%.2f", laptopDiscountedPrice.price));

        UnaryOperator<Product> isDelivery = product -> {
            if (product.price >= 3000) {
                return new Product(product.name, product.price + 100, product.discount);
            } else {
                return new Product(product.name, product.price + 50, product.discount);
            }
        };

        laptopDiscountedPrice = priceWithDiscount.andThen(isTaxes).andThen(isDelivery).apply(product1);
        System.out.println("Your " + laptopDiscountedPrice.name + " price after delivery is " + String.format("%.2f", laptopDiscountedPrice.price));

        String laptopFormattedFinalPrice = "€" + String.format("%.2f", laptopDiscountedPrice.price).replace('.', ',');
        System.out.println("Your " + laptopDiscountedPrice.name + " final price after being formatted is " + laptopFormattedFinalPrice);

        System.out.println("\nPRODUCT 2: " +"\n");

        Product product2 = new Product("TV", 2499, 0.1);

        Product tvDiscountedPrice = priceWithDiscount.apply(product2);
        System.out.println("Your " + tvDiscountedPrice.name + " price with discount is " + String.format("%.2f", tvDiscountedPrice.price));

        tvDiscountedPrice = priceWithDiscount.andThen(isTaxes).apply(product2);
        System.out.println("Your " + tvDiscountedPrice.name + " price after taxes is " + String.format("%.2f", tvDiscountedPrice.price));

        tvDiscountedPrice = priceWithDiscount.andThen(isTaxes).andThen(isDelivery).apply(product2);
        System.out.println("Your " + tvDiscountedPrice.name + " price after delivery is " + String.format("%.2f", tvDiscountedPrice.price));

        String tvFormattedFinalPrice = "€" + String.format("%.2f", tvDiscountedPrice.price).replace('.', ',');
        System.out.println("Your " + tvDiscountedPrice.name + " final price after being formatted is " + tvFormattedFinalPrice);


    }
}
