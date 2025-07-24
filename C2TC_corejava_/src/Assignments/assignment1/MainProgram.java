package Assignments.assignment1;

import entityclassassignment1.Student;

public class MainProgram {
	 private int id;
	    private String name;
	    private String department;

	    public Student(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    public void displayDetails() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
	    }

	    // main method to test
	    public static void main(String[] args) {
	        Student s1 = new Student(101, "Ramya", "CSE");
	        Student s2 = new Student(102, "Anu", "ECE");
	        Student s3 = new Student(103, "Kumar", "IT");

	        System.out.println("Student Details:");
	        s1.displayDetails();
	        s2.displayDetails();
	        s3.displayDetails();
	    }
	}


