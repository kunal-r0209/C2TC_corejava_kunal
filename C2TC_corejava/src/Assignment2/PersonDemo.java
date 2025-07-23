package Assignment2;

import java.util.Scanner;

public class PersonDemo {

    public static void main(String[] args) {
        // Scanner object to accept user inputs
        Scanner ob = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter Person Name: ");
        String name = ob.next();

        System.out.print("Enter Age: ");
        int age = ob.nextInt();

        System.out.print("Enter Gender: ");
        String gender = ob.next();

        System.out.print("Enter Taxable Income: ");
        int income = ob.nextInt();

        // Create Person object and set values
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // Display person details before tax calculation
        System.out.println("\nPerson Details Before Tax Calculation:");
        System.out.println(person);

        // Calculate tax
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        // Display person details after tax calculation
        System.out.println("\nPerson Details After Tax Calculation:");
        System.out.println(person);

        // Close the scanner
        ob.close();
    }
}
