package oops;

abstract class Shape 
{
    public abstract double calculateArea();
}

class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return 0.5 * base * height;
    }
}

public class Main3 
{

	public static void main(String[] args) 
	{
		Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Shape triangle = new Triangle(10, 8);
        System.out.println("Triangle Area: " + triangle.calculateArea());

	}

}