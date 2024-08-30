package inheritance;
class vehical1
{
	void drive()
	{
		System.out.println("driver vehical");
	}
}
class car5
{
	void drive1()
	{
		System.out.println("repairing a car");
	}
}

public class Practice2 {

	public static void main(String[] args) 
	{
		car5 obj=new car5();
		
		obj.drive1();
		vehical1 obj2=new vehical1();
		obj2.drive();
	}

}
