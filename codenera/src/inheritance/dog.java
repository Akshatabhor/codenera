package inheritance;

class animal 
{
	
		void eat()
		{
			System.out.println("eating some food .....");		
		}
}
public class dog extends animal
{
	void bark()
	{
		System.out.println("barking....");
	}
	public static void main(String[] args) 
	{
		dog obj=new dog();
		obj.eat();
		obj.bark();
	}

}
