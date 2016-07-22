package shoppingcart;

/*
 * Super Class Product have the same fields for all subclass. 
 * The common fields are : code, title, image, price.
 */
abstract class Product implements Item{

    private String code;
    private String title;
    private String image;
    private double price=0;

    public Product(String code, String title, String image, double price) {
        this.code = code;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
