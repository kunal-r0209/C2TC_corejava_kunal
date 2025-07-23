package Assignment2;

import java.util.Scanner;

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        // First customer using default constructor and setters
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        Customer c1 = new Customer();
        c1.setCustomerId(id);
        c1.setCustomerName(name);
        c1.setCustomerCity(city);

        System.out.println("\nCustomer Details (using setters):");
        System.out.println(c1);

        // Second customer using parameterized constructor
        System.out.print("\nEnter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        Customer c2 = new Customer(name, id, city);

        System.out.println("\nCustomer Details (using parameterized constructor):");
        System.out.println(c2);

        sc.close();
    }
}
