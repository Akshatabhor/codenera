package inheritance;
class vehical
{
	void drive()
	{
		System.out.println(" driving vehical.......");
	}
}
class car extends vehical
{
	void repair()
	{
		System.out.println("repairing a car.....");
	}
}
public class multileveldemo2 {

	public static void main(String[] args) 
	{
		car obj=new car();
		obj.repair();
		obj.drive();
	}

}
