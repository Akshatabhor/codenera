package inheritance;
class shape
{
	void getarea()
	{
		System.out.println("shape of rectangle 0.0");
	}
}
class rectangle extends shape
{
	double length;
	double width;
	public rectangle (double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	void getarea1()
	{
		System.out.println("area of rectangle:"+length*width);
	}
}
public class multileveldemo3 
{

	public static void main(String[] args) 
	{
		rectangle obj=new rectangle(30,20);
		obj.getarea1();
		obj.getarea();
		
	}

}
