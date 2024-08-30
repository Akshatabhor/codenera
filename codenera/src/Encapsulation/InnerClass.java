package Encapsulation;
class outer
{
	private int a=10;
	class inner
	{
		public void show()
		{
			System.out.println("inner method show...");
			System.out.println("outer private field:"+a);
		}
	}
	
}
public class InnerClass {

	public static void main(String[] args) 
	{
		outer.inner obj=new outer().new inner();
		obj.show();
	}

}
