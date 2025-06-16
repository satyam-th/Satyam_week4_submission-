abstract class Shape {
   
    final float pi;
    public Shape(float pi) {
      
        this.pi = 3.14f; // Using float for pi

    }

public void ShapeArea(){
    System.out.println("error: ");
}
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius, float pi) {
        super(pi);
        this.radius = radius;
    }

    @Override
    public void ShapeArea() {
        System.out.println("Calculating area for Circle with radius: " + radius);
        System.out.println("Area: " + (pi * radius * radius));
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, float pi) {
        super(pi);
        this.length = length;
        this.width = width;
    }

    @Override
    public void ShapeArea() {
        System.out.println("Calculating area for Rectangle with length: " + length + " and width: " + width);
        System.out.println("Area: " + (length * width));
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, float pi) {
        super(pi);
        this.base = base;
        this.height = height;
    }

    @Override
    public void ShapeArea() {
        System.out.println("Calculating area for Triangle with base: " + base + " and height: " + height);
        System.out.println("Area: " + (0.5 * base * height));
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
      Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, 3.14f);
        shapes[1] = new Rectangle(4, 6, 3.14f);
        shapes[2] = new Triangle(3, 4, 3.14f);

        for (Shape number : shapes) {
      
            number.ShapeArea();
        }
    }
}