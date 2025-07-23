package Assignment2;

public class Person {
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // Getter and Setter for Tax
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Income
    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    // Getter and Setter for Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override toString to display Person details
    @Override
    public String toString() {
        return "Person [Name=" + name + ", Income=" + income + ", Gender=" + gender + ", Age=" + age + ", Tax=" + tax + "]";
    }
}
