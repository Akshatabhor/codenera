 /*Write a Java program to create an abstract class Shape3D with abstract methods 
calculateVolume() and calculateSurfaceArea(). 
Create subclasses Sphere and Cube that extend the Shape3D class and implement the 
respective methods to calculate the volume and surface area of each shape.*/

package Abstraction;
abstract class shape3d
{
	public abstract double calculatevolume();
	public abstract double calculatesurfacearea();
}
class sphere extends shape3d
{
	double radious;
	public sphere(double radious) 
	{
		this.radious=radious;	
	}
	public double calculatevolume()
	{
		return(4.0 / 3.0) * Math.PI * Math.pow(radious, 3);
	}
	public double calculatesurfacearea()
	{
	    return 4 * Math.PI * Math.pow(radious, 2);
	}
}
class cube extends shape3d
{
	double side;
	public cube(double side)
	{
		this.side=side;
	}
	public double calculatevolume()
	{
		return Math.pow(side, 3);
	}
	public double calculatesurfacearea()
	{
		 return 6 * Math.pow(side, 2);
	}
}
public class Example6 {

	public static void main(String[] args) 
	{
		sphere obj=new sphere(5);
		System.out.println("volume of sphere:"+obj.calculatevolume());
		System.out.println("surface of sphere:"+obj.calculatesurfacearea());
		
		cube obj1=new cube(4);
		System.out.println("volume of cube:"+obj1.calculatevolume());
		System.out.println("surface of cube:"+obj1.calculatesurfacearea());


	}

}
