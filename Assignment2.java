

/*
    Assignment 2. Write a program called PensionContributionCalculator 
        for salaried Employee. Design employee class with attributes 
        like Emp_id, Emp_name, Age, Salary, Employee_contribution, 
        Employer_contribution etc. and calculate total pension contribution (Use Constructors).
        
        @ Employee's Age	Employee Rate (%)	Employer Rate (%)
        @ 55 and below	        20	                17
        @ above 55 to 60	    13	                13
        @ above 60 to 65	    7.5	                9
        @ above 65	            5       	        7.5
 */


 
import java.util.Scanner;

class Employee {
    
    int Emp_id;
    String Emp_name;
    int Age;
    double Salary;
    double Employee_contribution;
    double Employer_contribution;

    // Constructor 
    public Employee(int id, String name, int age, double salary) {
        this.Emp_id = id;
        this.Emp_name = name;
        this.Age = age;
        this.Salary = salary;
        calculatePensionContribution();
    }

    // calculate pension contribution
    private void calculatePensionContribution() {
        if (Age <= 55) {

            Employee_contribution = Salary * 0.20;
            Employer_contribution = Salary * 0.17;

        } else if (Age>55 && Age <= 60) {

            Employee_contribution = Salary * 0.13;
            Employer_contribution = Salary * 0.13;

        } else if ( Age> 60 && Age <= 65) {

            Employee_contribution = Salary * 0.075;
            Employer_contribution = Salary * 0.09;

        } else {

            Employee_contribution = Salary * 0.05;
            Employer_contribution = Salary * 0.075;

        }
    }

    // Method to display employee details and pension contributions
    public void display() {

        calculatePensionContribution();

        System.out.println("\nEmployee ID           : " + Emp_id);
        System.out.println("Employee Name         : " + Emp_name);
        System.out.println("Age                   : " + Age);
        System.out.println("Salary                : " + Salary);
        System.out.println("Employee Contribution : " + Employee_contribution);
        System.out.println("Employer Contribution : " + Employer_contribution);
        System.out.println();
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        System.out.println("Assignment No : 2");

        Scanner scanner = new Scanner(System.in);

        // Get employee details from the user
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = scanner.next();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(id, name, age, salary);

        // Display employee details and pension contributions
        employee.display();

        scanner.close();
    }
}
