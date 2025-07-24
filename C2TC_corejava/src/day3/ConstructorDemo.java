package day3;

import java.util.Scanner;

class Customer {
    private int customerId;
    private String customerName;
    private String customerCity;

    // Default constructor
    public Customer() {
        this.customerId = 0;
        this.customerName = "";
        this.customerCity = "";
    }

    // Parameterized constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Setters
    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setCustomerCity(String city) {
        this.customerCity = city;
    }

    // toString method to display customer details
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + customerName + ", City: " + customerCity;
    }
}

public class ConstructorDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println();

        // Using default constructor
        Customer c1 = new Customer();
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println("Customer 1: " + c1);

        // Second customer details
        System.out.print("\nEnter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        // Using parameterized constructor
        Customer c2 = new Customer(name, id, city);
        System.out.println("Customer 2: " + c2);

        sc.close();
    }
}
