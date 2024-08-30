package inheritance;
class access
{
	public int a=10;
	private int b=20;
	public access()
	{
		System.out.println("constructor...");
	}
	public void disp()
	{
		System.out.println("display method....");
		System.out.println("private variable:"+b);
	}
}
public class accessmodifierpublic 
{

	public static void main(String[] args) 
	{
		access obj=new access();
		System.out.println(obj.a);
		obj.disp();
		//System.out.println(obj.b);//private modifier is not access outside the class it access only with in class.

	}

}
