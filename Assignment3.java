
/*
     3.	Write a program to calculate area and perimeter
        of basic geometric figures using method overloading.

*/
import java.util.*;

public class Assignment3 {

    /*
            @ Area

     *  Square
     *  Reactangle
     *  Circle
     
    */ 
    public static int area(int side){
        return side*side;
    }

    public static int area(int lenght,int breath){
        return lenght*breath;
    }

    public static double area(double radius){
        return Math.PI * radius * radius;
    }

    /*
            @ Perimeter

     *  Square
     *  Reactangle
     *  Circle
     
    */ 

    public static int perimeter(int side){
        return 4*side;
    }

    public static int perimeter(int lenght,int breath){
        return 2 * ( lenght + breath);
    }

    public static double perimeter(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println("Assignment no 3");

        Scanner pk = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("\n----------------------------------------\n");
            System.out.println("           Menu");
            System.out.println(" 1 )  Area / Perimeter Of Square");
            System.out.println(" 2 )  Area / Perimeter Of Reactangle");
            System.out.println(" 3 )  Area / Perimeter Of Circle");
            System.out.print("\n Enter Your Choice : ");
            choice = pk.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the side of Square  : ");
                    int side = pk.nextInt();
                    System.out.println("Area of Square      : "+area(side)+" m^2");
                    System.out.println("Perimeter of Square : "+perimeter(side)+" m");
                    break;
                case 2:
                    System.out.print("\nEnter the length of Reactangle : ");
                    int lenght = pk.nextInt();
                    System.out.print("Enter the breath of Reactangle : ");
                    int breath = pk.nextInt();
                    System.out.println("Area of Square      : "+area(lenght,breath)+" m^2" );
                    System.out.println("Perimeter of Square : "+perimeter(lenght,breath)+" m");
                    break;
                case 3:
                    System.out.print("\nEnter the Radius of Circle : ");
                    double radius = pk.nextInt();
                    System.out.println("Area of Circle      : "+area(radius)+" m^2");
                    System.out.println("Perimeter of Circle : "+perimeter(radius)+" m");
                    break;
                default :
                    System.out.println("   Exit ");          
            }
        }while(choice!=4);
    }
}


/*
    @ Output 

        Assignment no 3

    ----------------------------------------

            Menu
    1 )  Area / Perimeter Of Square
    2 )  Area / Perimeter Of Reactangle
    3 )  Area / Perimeter Of Circle

    Enter Your Choice : 1

    Enter the side of Square  : 10
    Area of Square      : 100 m^2
    Perimeter of Square : 40 m

    ----------------------------------------

            Menu
    1 )  Area / Perimeter Of Square
    2 )  Area / Perimeter Of Reactangle
    3 )  Area / Perimeter Of Circle

    Enter Your Choice : 2

    Enter the length of Reactangle : 6
    Enter the breath of Reactangle : 8
    Area of Square      : 48 m^2
    Perimeter of Square : 28 m

    ----------------------------------------

            Menu
    1 )  Area / Perimeter Of Square
    2 )  Area / Perimeter Of Reactangle
    3 )  Area / Perimeter Of Circle

    Enter Your Choice : 3

    Enter the Radius of Circle : 14
    Area of Circle      : 615.7521601035994 m^2
    Perimeter of Circle : 87.96459430051421 m

    ----------------------------------------

            Menu
    1 )  Area / Perimeter Of Square
    2 )  Area / Perimeter Of Reactangle
    3 )  Area / Perimeter Of Circle

    Enter Your Choice : 4
    Exit
    PS C:\Users\Pranav\Downloads\6 Companies 30 Days\Assignment> 
 */