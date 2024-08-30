package LambdaExpression;
@FunctionalInterface
interface demo6
{
	public void disp();
	
}
public class LambdaDemo 
{

	public static void main(String[] args)
	{
		demo6 ob=() ->{
			System.out.println("this is lambda expreesion");
		};
		ob.disp();
	}

}
