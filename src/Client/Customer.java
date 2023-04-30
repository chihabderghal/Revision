package Client;

public class Customer extends Human {
    public String address, order, size;
    private int budget;
    public Customer(String name, String gender, byte age, String country, int budget, String address, String order, String size) {
        super(name, gender, age, country);
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

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

}