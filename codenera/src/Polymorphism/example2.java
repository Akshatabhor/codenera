package Polymorphism;
class vehical
{
	public void speedup()
	{
		System.out.println("vehical speed up to 100kmph");
	}
}
class car extends vehical
{
	public void speedup()
	{
		System.out.println("car speed up to 60kmph");

	}
}
class bicycle extends vehical
{
	public void speedup()
	{
		System.out.println("bicycle speed up to 40kmph");

	}
}

public class example2 {

	public static void main(String[] args) 
	{
		vehical obj=new car();
		obj.speedup();
		vehical obj1=new bicycle();
		obj1.speedup();
	}

}
