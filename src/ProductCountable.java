package shoppingcart;

/*
 * Subclass of Product. Inherits common fields, and have new field quantity 
 * and iplements Item interface methods: price, details 
 */
public class ProductCountable extends Product {
    
    private int quantity=1;
    
    public ProductCountable(String code, String title, String image, double price) {
        super(code, title, image, price);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public double price() {
        return (this.getPrice() * quantity);
    }

    @Override
    public String detail() {
        return ("Code: "+ getCode() + " Title: " + getTitle() +
                " Quantity: " + quantity);
    }
}
