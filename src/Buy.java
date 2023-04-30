import Client.*;
import Product.Product;

public class Buy {
    Customer customer;
    Product product;
    public int quantity;
    public static int numberOfSelles = 0;

    public Buy(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
        numberOfSelles++;
    }

    private float resetOfMoney = customer.getBudget() - product.getPrice();

    public void showOrderStatus() {
        System.out.println("-------------------------------------");
        System.out.printf("(%d) Customer information : \n", numberOfSelles);
        System.out.println("Name : " + customer.getName());
        System.out.println("Age : " + customer.getAge());
        System.out.println("Gender : " + customer.getGender());
        System.out.println("Country : " + customer.getCountry());
        System.out.println("address : " + customer.getAddress());
        System.out.println("-------------------------------------");

        // System.out.println("rest of money : " + resetOfMoney);
    }


}
