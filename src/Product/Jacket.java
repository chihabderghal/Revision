package Product;

public class Jacket extends Product {
    public static final float price = 4999;

    public Jacket(String size, String color, String productGender) {
        super(size, color, productGender, price);
    }
}
