package Polymorphism;

class animal5
{
	public void sound()
	{
		System.out.println("sound of animal");
	}
}
class bird extends animal5
{
	public void sound()
	{
		System.out.println("sound of birds");
	}
}
class cat extends animal5
{
	public void sound()
	{
		System.out.println("meow meow");
	}
}
public class methodoverrideexample1 {

	public static void main(String[] args) 
	{
		animal5 obj=new animal5();
		obj.sound();
		animal5 obj1=new bird();
		obj1.sound();
		animal5 obj2= new cat();
		obj2.sound();
		
	}

}
