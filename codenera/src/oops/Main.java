package oops;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);  
    }

    @Override
    public double calculateArea() {
        double side = getLength();
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        double side = getLength();
        return 4 * side;
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return getLength();
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Square square = new Square(5);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
