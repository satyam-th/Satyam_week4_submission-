abstract class Shape {
    private double area;
    final float pi;
    public Shape(double area, float pi) {
        this.area = area;
        this.pi = 3.14f; // Using float for pi

    }

public void ShapeArea(){
    System.out.println("error: ");
}
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius, double area, float pi) {
        super(area, pi);
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

    public Rectangle(double length, double width, double area, float pi) {
        super(area, pi);
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

    public Triangle(double base, double height, double area, float pi) {
        super(area, pi);
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
        shapes[0] = new Circle(5, 0, 3.14f);
        shapes[1] = new Rectangle(4, 6, 0, 3.14f);
        shapes[2] = new Triangle(3, 4, 0, 3.14f);

        for (Shape number : shapes) {
      
            number.ShapeArea();
        }
    }
}