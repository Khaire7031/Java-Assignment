

/*
    5.	Design Vehicle class hierarchy to implement different
        kinds of inheritance. Use Super, this, static keywords.
 */

import java.util.*;

class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    public static void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

/*
    @ Single inheritance
        A subclass inherits from only one superclass.

        Car -> inherits -> Vehicle
*/ 

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int year, int numOfDoors) {
        super(brand, year);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return this.numOfDoors;
    }

    public static void displayInfo() {
        System.out.println("This is a car.");
    }
}

/*
    @ Hierarchical Inheritance
        Multiple subclasses inherit from the same superclass.

        Car -> inherits -> Vehicle
        Truck -> inherits -> Vehicle
*/ 
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return this.loadCapacity;
    }

    public static void displayInfo() {
        System.out.println("This is a truck.");
    }
}

/*
    @ Multilevel Inheritance: 
        A subclass inherits from another subclass.

        Truck -> inherits -> Vehicle
        
        AshokLeyland -> inherits -> Truck
 */
class AshokLeyland extends Truck {
    private String  Owner;

    public AshokLeyland(String brand, int year, double loadCapacity,String own) {
        super(brand, year, loadCapacity);
        this.Owner = own;
    }

    public String getOwner() {
        return this.Owner;
    }
}
/*
    @ Multiple Inheritance (through interfaces): 
        A class implements multiple interfaces, effectively inheriting 
        behavior from all of them. Direct multiple inheritance of 
        classes is not supported in Java.

        C -->  implements --> A,B
*/
interface A {
    public void interfaceMethodA();    
}
interface B {
    public void interfaceMethodB();    
}
class C implements A,B {

    @Override
    public void interfaceMethodA(){
        System.out.println("This is interface A Method");
    }

    @Override
    public void interfaceMethodB(){
        System.out.println("This is interface B Method");
    }

    public void classMethodC(){
        System.out.println("This is class C Method");
    }
}



public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("        Assignment Number : 7\n");

        // Single inheritance

        System.out.println("              Car\n");
        Car car1 = new Car("Audi", 5, 4);

        System.out.println("Brand     : "+car1.getBrand());;
        System.out.println("Year      : "+car1.getYear());;
        System.out.println("NoofDoors : "+car1.getNumOfDoors());;


        System.out.println();

        // Hierarchical Inheritance
        System.out.println("                Truck\n");
        Truck truck1 = new Truck("Tata Motors", 10, 150);
        System.out.println("Brand         : "+truck1.getBrand());;
        System.out.println("Year          : "+truck1.getYear());;
        System.out.println("Load Capacity : "+truck1.getLoadCapacity());;

        System.out.println();

        // Multilevel Inheritance
        System.out.println("                AshokLeyland \n");
        AshokLeyland ashokObj = new AshokLeyland("AshokLeyland", 15, 500, " Hinduja Group");
        System.out.println("Brand         : "+ashokObj.getBrand());;
        System.out.println("Year          : "+ashokObj.getYear());;
        System.out.println("Load Capacity : "+ashokObj.getLoadCapacity());;
        System.out.println("Onwer         : "+ashokObj.getOwner());
    }
}


/*
    @ Output 
            Assignment Number : 7

                        Car

        Brand     : Audi
        Year      : 5
        NoofDoors : 4

                        Truck

        Brand         : Tata Motors
        Year          : 10
        Load Capacity : 150.0

                        AshokLeyland

        Brand         : AshokLeyland
        Year          : 15
        Load Capacity : 500.0
        Onwer         :  Hinduja Group

        PS C:\Users\Pranav\Downloads\6 Companies 30 Days\Assignment> 
 */