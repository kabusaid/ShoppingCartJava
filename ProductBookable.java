package shoppingcart;

/*
 * Subclass of Product. Inherits common fields, and have 3 new fields: date, time, hours 
 * and iplements Item interface methods: price, details 
 */
public class ProductBookable extends Product {
    
    private String date;
    private String time; 
    private int hours=1;
    
    public ProductBookable(String code, String title, String image, double price) {
        super(code, title, image, price);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    @Override
    public double price() {
        return (this.getPrice() * hours);
    }
    
    @Override
    public String detail() {
        return ("Code: "+ getCode() +" Title: "+ getTitle() +" Date: "+ date +
                " Time: "+ time + " Hours: "+ hours);
    }
    
}
