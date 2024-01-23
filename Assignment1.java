
/* 
    1.	Write a program called IncomeTaxCalculator for salaried Employee. 
        Design employee class with attributes like Emp_id, Emp_name, Age, 
        Annual_income, Tax etc and calculate total income tax for a particular
        financial year.(Use java methods)

            Hint:Slab rate                               IT rate

        @ Upto Rs. 5 lacs                               Nil
        @ From Rs. 5 lacs - Rs. 10 lacs          10% on additional amount
        @ From Rs. 10 lacs - Rs.  50 lacs        20% on additional amount
        @ Above Rs. 50 lacs                      30% on additional amount
*/


import java.util.Scanner;

class Employee {
    int Emp_id;
    String Name;
    int Age;
    int Annual_income;

    double Tax = 0;

    // Constructor

    Employee(int emp_id, String name, int age, int annual_income) {

        this.Emp_id = emp_id;
        this.Name = name;
        this.Age = age;
        this.Annual_income = annual_income;
    }

    // Calculate Tax
    private double calculateTax() {
        double additionalAmount = 0.0;

        if (Annual_income <= 500000) {

            Tax = 0;

        } else if (Annual_income <= 1000000) {

            additionalAmount = Annual_income - 500000;
            Tax = additionalAmount * 0.10;

        } else if (Annual_income <= 5000000) {

            additionalAmount = Annual_income - 1000000;
            Tax = (500000 * 0.10) + (additionalAmount * 0.20);

        } else {

            additionalAmount = Annual_income - 5000000;
            Tax = (500000 * 0.10) + (4000000 * 0.20) + (additionalAmount * 0.30);

        }

        return Tax;
    }

    public void display() {
        // Calculate Tax
        calculateTax();

        System.out.println(" \n 1) Employee ID   : " + Emp_id);
        System.out.println(" 2) Employee Name : " + Name);
        System.out.println(" 3) Age           : " + Age);
        System.out.println(" 4) Annual Income : " + Annual_income);
        System.out.println(" 5) Income Tax    : " + Tax);
        System.out.println(" 6) Total Amount  : " + (Annual_income + Tax));
        System.out.println();
    }

}

public class Assignment1 {
    public static void main(String[] args) {

        System.out.println("\n     Assignment No : 1 \n");

        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Enter your Name : ");
        String Name = scan.nextLine();

        System.out.print("Enter your Id : ");
        int Emp_id = scan.nextInt();

        System.out.print("Enter your Age : ");
        int Age = scan.nextInt();

        System.out.print("Enter your Annual income : ");
        int Annual_income = scan.nextInt();

        // Object 
        Employee employee = new Employee(Emp_id, Name, Age, Annual_income);

        // Output
        employee.display();

        scan.close();
    }
}




/*
    @ Output 1

        Assignment No : 1 

    Enter your Name : Pranav
    Enter your Id : 45
    Enter your Age : 20
    Enter your Annual income : 750000
    
    1) Employee ID   : 45
    2) Employee Name : Pranav
    3) Age           : 20
    4) Annual Income : 750000
    5) Income Tax    : 25000.0
    6) Total Amount  : 775000.0

    

    @ Output 2 

        Assignment No : 1

    Enter your Name : Swapnil Dhumal
    Enter your Id : 17
    Enter your Age : 21
    Enter your Annual income : 1405000

    1) Employee ID   : 17
    2) Employee Name : Swapnil Dhumal
    3) Age           : 21
    4) Annual Income : 1405000
    5) Income Tax    : 131000.0
    6) Total Amount  : 1536000.0

 */