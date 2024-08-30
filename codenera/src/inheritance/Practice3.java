package inheritance;
class shape5
{
	void getarea()
	{
		System.out.println("area of rectangle");
	}
}
class rectangle5 extends shape5
{
	double length;
	double width;
	public rectangle5(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	void getarea1()
	{
		System.out.println(length*width);
	}
}
public class Practice3 {

	public static void main(String[] args) 
	{
		rectangle5 obj=new rectangle5(20,30);
		obj.getarea();
		obj.getarea1();
	}

}
