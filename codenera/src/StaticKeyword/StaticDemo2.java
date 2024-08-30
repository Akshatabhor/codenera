package StaticKeyword;
class StaticMethod
{
	static int cnt=0;
	StaticMethod()
	{
		cnt++;
		System.out.println(cnt);
	}
	public void add()
	{
		System.out.println("cnt :"+cnt);
	}
	public static void add1()
	{
		System.out.println("Static method");
		System.out.println("cnt :"+cnt);
	}
}
public class  StaticDemo2
{

	public static void main(String[] args) 
	{
		StaticMethod obj=new StaticMethod();
		StaticMethod obj1=new StaticMethod();
		StaticMethod obj2=new StaticMethod();
		StaticMethod obj3=new StaticMethod();
		
		obj1.add();
		obj2.add();
	
		StaticMethod.add1();		

	}

}
