package inheritance;
class animalA
{
	void eat()
	{
		System.out.println("eating........");
	}
	
}
class dogA extends animalA
{
	void bark()
	{
		System.out.println("barking.......");
	}
}
class babydog extends dogA
{
	void weep()
	{
		System.out.println("weeping...........");
	}
}
public class multileveldemo 
{

	public static void main(String[] args) 
	{
		babydog obj=new babydog();
		obj.weep();
		obj.bark();
		obj.eat();
	}

}
