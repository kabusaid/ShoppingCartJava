package shoppingcart;

/*
 * Item Interface for different products like: countable , bookable, 
 * downloadable, or products depend on weight.
 */
public interface Item {
    
    public double price();
    public String detail();
    
}
