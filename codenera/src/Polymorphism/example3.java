package Polymorphism;
abstract class shape
{
	
		abstract double calculatearea();
	
}
class circle extends shape
{
	double radious;
	circle(double radious)
	{
		this.radious=radious;
	}
	double calculatearea()
	{
		return Math.PI*radious*radious;
	}
	
}
class rectangle extends shape
{
	double width,hight;
	rectangle(double width,double hight)
	{
		this.width=width;
		this.hight=hight;
	}
	double calculatearea()
	{
		return width*hight;
	}
}
class triangle extends shape
{
	double base,hight;
	triangle(double base, double hight)
	{
		this.base=base;
		this.hight=hight;
	}
	double calculatearea()
	{
		return 0.5*base*hight;
	}
}
public class example3 {

	public static void main(String[] args)
	{
		shape obj = new circle(5);
        System.out.println("Area of Circle: " + obj.calculatearea());
        shape obj1= new rectangle(2,3);
        System.out.println("area of rectangle:"+obj1.calculatearea());
        shape obj2=new triangle(2,3);
        System.out.println("area of triangle:"+obj2.calculatearea());
	}

}
