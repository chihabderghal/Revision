package Client;

public class Customer extends Human {
    public String address, order, size;
    public float budget;
    public Customer(String name, String gender, byte age, String country, float budget, String address, String order, String size) {
        super(name, gender, age, country);
        this.budget = budget;
        this.address = address;
        this.order = order;
        this.size = size;
    }
    public Customer(String name, byte age, String country, float budget, String address, String order, String size) {
        super(name, age, country);
        this.budget = budget;
        this.address = address;
        this.order = order;
        this.size = size;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public float getBudget() {
        return budget;
    }

}