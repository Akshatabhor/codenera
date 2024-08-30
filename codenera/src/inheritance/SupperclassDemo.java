package inheritance;
class base
{
	int amt=1000;
}
class child extends base
{
	int amt=1100;
	public void disp()
	{
		System.out.println(super.amt);
		System.out.println(amt);
	}
}
class child1 extends child
{
	int amt=1200;
	public void disp1()
	{
		System.out.println(amt);
	}
}
public class SupperclassDemo {

	public static void main(String[] args) 
	{
		child1 obj=new child1();
		obj.disp1();
		obj.disp();
	}

}
