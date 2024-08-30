package FinalKeyword;
 class parent//when we declare class with final you cannot inherite or extends
{
	public final void disp()//when we declare method with final keyword you cannot override
	{
		System.out.println("parent class display");
	}
}
final class child extends parent
{
	//public void disp()
	//{
		//System.out.println("child class display");
	//}
}

public class FinalVariable// extends child i.echild class is final
{
	final double PI = 3.14;//when we declare variable is final you cannot change it
	int b;
	int c = 0;
	public void print()
	{
		b = 20;
		b++;
		
		System.out.println("instance variable : "+b);		
		System.out.println("Final varaible : "+PI);
	}
	public static void main(String[] args)
	{
		FinalVariable obj = new FinalVariable();
		obj.print();
		child obj1=new child();
		obj1.disp();
	}
	

}
