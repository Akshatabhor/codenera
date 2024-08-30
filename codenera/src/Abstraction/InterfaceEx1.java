/*Write a Java program to create an interface Shape 
 * with the getArea() method. Create three classes 
 * Rectangle, Circle, and Triangle that implement the 
 * Shape interface. Implement the getArea() method for each 
 * of the three classes.
 */

package Abstraction;
interface Shape1
{
	 double getarea();
}
class Rectangle implements Shape1
{
	double length;
	double width;
	public Rectangle(double length ,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getarea()
	{
		return length*width;
	}
}
class Circle5 implements Shape1
{
	double radious;
	public Circle5(double radious)
	{
		this.radious=radious;
	}
	public double getarea()
	{
		return Math.PI*radious*radious;
	}
}
class Triangle1 implements Shape1
{
	double base;
	double height;
	public Triangle1(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public double getarea()
	{
		return 0.5*base*height;
	}
}
public class InterfaceEx1 {

	public static void main(String[] args)
	{
		Rectangle obj=new Rectangle(5,10);
		Circle5 obj1=new Circle5(5);
		Triangle1 obj2=new Triangle1(4,5);
		System.out.println("area of rectangle:"+obj.getarea());
		System.out.println("area of circle:"+obj1.getarea());
		System.out.println("area of triangle:"+obj2.getarea());
	}

}
