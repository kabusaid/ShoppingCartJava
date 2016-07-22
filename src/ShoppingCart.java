package shoppingcart;

import java.util.ArrayList;
import java.util.List;

/*
 * Shopping Cart Class tha can contain different products: Countable or Bookable 
 * The Class methods :add or remove product, show content of the cart, and calculate
 * the total price for all shopping cart content.
 */
public class ShoppingCart {

    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        if (products.contains(product) )
            this.products.remove(product);
    }
    
    public String content() {
        String content = "\n";
        for (Product product : products) {
            content += (products.indexOf(product)+1)+" " + product.detail() + "\n";
        }
        return content;
    }

    public double calculateTotal() {
        double sum = 0;
        for (Product product : products) {
            sum += product.price();
        }
        return sum;
    }

}