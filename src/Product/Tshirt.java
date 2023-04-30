package Product;
public class Tshirt extends Product {
    protected static final float price = 2000;

    public Tshirt(String size, String color, String productGender) {
        super(size, color, productGender, price);
    }
}
