package inheritance;
class shape1
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
class circle extends shape1
{
	double radious;
	
	public circle (double radious)
	{
		this.radious=radious;
		
	}
	void getperimeter1()
	{
		System.out.println("perimeter of circle:"+2*Math.PI*radious);
	}
	void getarea1()
	{
		System.out.println("area of circle:"+Math.PI*radious*radious);
	}
}
public class multileveldemo5 
{

	public static void main(String[] args) 
	{
		circle obj=new circle(4);
		obj.getperimeter1();
		obj.getarea1();
		
	}

}
