/*Write a Java program to create a class called Circle with 
 * a private instance variable radius. Provide public getter and setter methods 
 * to access and modify the radius variable. However, provide two methods called 
 * calculateArea() and calculatePerimeter() that return the calculated area and 
 * perimeter based on the current radius value.
 */



package Encapsulation;
class circle
{
	private int radious;
	public void setradious(int radious)
	{
		this.radious=radious;
	}
	public int getradious()
	{
		return radious;
	}
	public double getperimeter()
	{
		double perimeter=2*3.14*radious;
		return perimeter;
	}
	public double getarea()
	{
		double area=3.14*radious*radious;
		return area;
	}
}
public class Example5 {

	public static void main(String[] args) 
	{
		circle obj=new circle();
		obj.setradious(5);
		
		System.out.println("radious of circle:"+obj.getradious());
		double area=obj.getarea();
		System.out.println("area of circle:"+obj.getarea());
		double perimeter=obj.getperimeter();
		System.out.println("perimeter of circle:"+obj.getperimeter());
	}

}
