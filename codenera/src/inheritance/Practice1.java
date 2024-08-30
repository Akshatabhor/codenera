package inheritance;
class animal6
{
	void sound()
	{
		System.out.println("make a animal sound...");
	}
}
class cat3 extends animal6
{
	void bark()
	{
		System.out.println("meow");
	}
}
public class Practice1 {

	public static void main(String[] args) 
	{
		cat3 obj=new cat3();
		obj.bark();
		obj.sound();
		
	}

}
