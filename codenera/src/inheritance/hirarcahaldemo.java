package inheritance;
class AnimalY
{
	void eat()
	{
		System.out.println("eating....");
	}
}
class CatY extends AnimalY
{
	void run()
	{
		System.out.println("cat running...");
	}
}
class DogY extends AnimalY
{
	void bark()
	{
		System.out.println("dog running....");
	}
}
public class hirarcahaldemo 
{

	public static void main(String[] args) 
	{
		CatY obj=new CatY();
		obj.eat();
		obj.run();
		DogY obj1=new DogY();
		obj1.bark();
	}

}
