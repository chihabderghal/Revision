import Client.*;

public class Buy {
    Customer customer;
    public int quantity;
    public static int numberOfSelles = 0;
    // private float resetOfMoney;

    public Buy(Customer customer) {
        this.customer = customer;
        numberOfSelles++;
    }

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
