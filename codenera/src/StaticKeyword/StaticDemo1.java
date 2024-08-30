package StaticKeyword;
class StaticCounter
{
	static int cnt=0;
	StaticCounter()
	{
		cnt++;
		System.out.println(cnt);
	}
}
public class StaticDemo1 {

	public static void main(String[] args) 
	{
		StaticCounter obj=new StaticCounter();
		StaticCounter obj1=new StaticCounter();
		StaticCounter obj2=new StaticCounter();
		StaticCounter obj3=new StaticCounter();

	}

}
