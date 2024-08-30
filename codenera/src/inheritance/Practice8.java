package inheritance;
class shape2
{
	void getperimeter()
	{
		System.out.println("perimeter shape:");
	}
	void getarea()
	{
		System.out.println("area shape:");
	}
}
class circle1 extends shape2
{
	double radious;
	
	public circle1 (double radious)
	{
		this.radious=radious;
		
	}
	void getperimeter1()
	{
		super.getperimeter();
		System.out.println("perimeter of circle:"+2*Math.PI*radious);
	}
	void getarea1()
	{
		super.getarea();
		System.out.println("area of circle:"+Math.PI*radious*radious);
	}
}
public class Practice8 {

	public static void main(String[] args)
	{
		circle1 obj=new circle1(5);
		obj.getperimeter1();
		obj.getarea1();
	}

}
