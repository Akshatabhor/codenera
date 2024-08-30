package inheritance;
class Animal1
	{
		void sound()
		{
			System.out.println("animal make a sound........");		
		}
	
	}
class cat extends Animal1
	{
		void meow()
		{
			System.out.println("meow...........");
		}
	}
public class multileveldemo1 {

	public static void main(String[] args) 
	{
		cat obj=new cat();
		obj.sound();
		obj.meow();
		
	}

}
