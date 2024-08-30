package inheritance;
class base1
{
	int amt=1000;
	public void disp()
	{
		System.out.println("current class amt"+amt);
	}
}
class child2 extends base1
{
	int amt=1100;
	public void disp()
	{
		
		System.out.println("amt of base class using super"+super.amt);
		super.disp();
		System.out.println("child amt"+amt);
	}
}
class child3 extends child2
{
	int amt=1200;
	public void disp()
	{
		super.disp();
		System.out.println("amt of base class using super"+super.amt);
		System.out.println(amt);
	}
}
public class SuperMethodDemo 
{

	public static void main(String[] args) 
	{
		child3 obj=new child3();
		obj.disp();
		
	}

}
