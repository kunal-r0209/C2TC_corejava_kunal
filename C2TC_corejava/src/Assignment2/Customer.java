package Assignment2;

public class Customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // Getters (optional, if needed)
    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    // Overriding toString() to print Customer details
    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + customerName + ", City=" + customerCity + "]";
    }
}
