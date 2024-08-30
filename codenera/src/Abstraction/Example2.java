/*Write a Java program to create an abstract class 
 * Shape with abstract methods calculateArea() and calculatePerimeter(). 
 * Create subclasses Circle and Triangle that extend the Shape class and 
 * implement the respective methods to calculate the area and perimeter of each
 *  shape.
*/

package Abstraction;
abstract class shape
{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class circle extends shape
{
	private double radious;
	public circle(double radious)
	{
		this.radious=radious;
	}
	double calculateArea()
	{
		return Math.PI*radious*radious;
	}
	double calculatePerimeter()
	{
		return 2*Math.PI*radious;
	}
}
class triangle extends shape
{
	double s1,s2,s3;
	public triangle(double s1, double s2, double s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	double calculateArea()
	{
		double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)); 
	}
	
	double calculatePerimeter()
	{
		return s1+s2+s3;
	}
}

public class Example2 {

	public static void main(String[] args) 
	{
		triangle obj=new triangle(5, 4,3);
		System.out.println("area of triangle:"+obj.calculateArea());
		System.out.println("perimeter of triangle:"+obj.calculatePerimeter());
		
		circle obj1=new circle(5);
		System.out.println("area of circle:"+obj.calculateArea());
		System.out.println("perimeter of circle:"+obj.calculatePerimeter());
		


	}

}
