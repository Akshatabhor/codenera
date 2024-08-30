package StaticKeyword;

public class StaticBlockDemo 
{
	static
	{
		System.out.println("static block");
		
	}
	{
		System.out.println("default block");
	}
	public StaticBlockDemo()
	{
		System.out.println("constructor block");
	}
	public void disp()
	{
		System.out.println("display method");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		StaticBlockDemo obj= new StaticBlockDemo();
		obj.disp();
		
	}

}
