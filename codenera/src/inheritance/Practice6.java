package inheritance;
class animalX
{
	public void move()
	{
		System.out.println("animal class");
	}
}
class cheetah extends animalX
{
	public void move1()
	{
		System.out.println("cheetah run fastly");
	}
}

public class Practice6 {

	public static void main(String[] args) 
	{
		cheetah obj=new cheetah();
		obj.move();
		obj.move1();
		
		
	}

}
