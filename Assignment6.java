
/*
     6.	Design Shape class hierarchy. Implement Polymorphism on draw method.
 */
import java.util.*;

abstract class Shape {
    public abstract void draw();
    public abstract void displayShape();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    @Override
    public void displayShape() {
        System.out.println();
        int radius = 10;
        int centerX = radius;
        int centerY = radius;

    
        for (int y = 0; y <= 2 * radius; y++) {
            for (int x = 0; x <= 2 * radius; x++) {
                double distance = Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));

                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void displayShape() {
        int length  = 5;
        int breadth = 15;
        System.out.println();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void displayShape() {
        int height = 10;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class Assignment6 {

    // Polymorphic method 1
    public static void drawShape(Shape shape) {
        shape.draw();
    }

    // Polymorphic method 2
    public static void displayShape(Shape shape) {
        shape.displayShape();
    }
    public static void main(String[] args) {
        System.out.println("        Assignment 6");

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        // Polymorphism in action
        drawShape(circle);
        drawShape(rectangle);
        drawShape(triangle);


        // Polymorphism in action
        displayShape(circle);
        displayShape(rectangle);
        displayShape(triangle);
    }
}

