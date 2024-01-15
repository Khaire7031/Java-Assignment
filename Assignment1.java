package Assignment;

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

        System.out.println(" \n1) Employee ID   : " + Emp_id);
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

        System.out.println("    Assignment No : 1 \n\n");

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
    }
}
