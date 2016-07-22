package shoppingcart;

public class Test {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Create Countable Product with Price 10$ and Quantity 2
        ProductCountable p1 = new ProductCountable("SC001", "Watch", "Watch.png", 10);
        p1.setQuantity(2);
        
        // Create Bookable Product with Price 30$/Hour and Specific date, time and for 3 hours
        ProductBookable p2 = new ProductBookable("SC002", "Hotel Room", "Mobile.png", 30);
        p2.setDate("23/7/2016");
        p2.setTime("20:00");
        p2.setHours(3);

        // Add the different products to Shopping Cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        
        // Print The Content of the Cart and the Total Price.
        System.out.println( "Cart Content: "+ cart.content() );
        System.out.println( "Total Price: "+ cart.calculateTotal() );
    }

}
