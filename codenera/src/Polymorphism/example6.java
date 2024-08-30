package Polymorphism;
class shapeA
{
	public void getarea()
	{
		
	}
	public void getperimeter()
	{
		
	}
}
class circleA extends shapeA
{
	double r=0;
	double areaofcircle=3.14*2*2;
	public void getarea()
	{
		System.out.println("area of circle");
		System.out.println(areaofcircle);
	}
	public void getperimeter()
	{
		System.out.println("perimeter of circle");
		System.out.println(areaofcircle);
	}
}
class rectangleA extends shapeA
{
	int l=4;
	int w=5;
	double areaofrectangle=4*5;
	public void getarea()
	{
		System.out.println("area of rectangle");
		System.out.println(areaofrectangle);
	}
	public void getperimeter()
	{
		System.out.println("perimeter of rectangle");
		System.out.println(areaofrectangle);
	}
}
class triangleA extends shapeA
{
	int b=4;
	int h=5;
	double areaoftriangle=0.5*4*5;
	public void getarea()
	{
		System.out.println("area of triangle");
		System.out.println(areaoftriangle);
	}
	public void getperimeter()
	{
		System.out.println("perimeter of triangle");
		System.out.println(areaoftriangle);
	}
}
public class example6 
{

	public static void main(String[] args) 
	{
		shapeA obj=new circleA();
		obj.getarea();
		obj.getperimeter();
		shapeA obj1 = new rectangleA();
		obj1.getarea();
		obj1.getperimeter();
		shapeA obj3=new triangleA();
		obj3.getarea();
		obj3.getperimeter();
	}

}
