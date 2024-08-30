package LambdaExpression;
@FunctionalInterface
interface demo7
{
	public void square(int a);
}
public class LambdaSquare
{

	public static void main(String[] args) 
	{
		demo7 ob=(int a) ->{
			System.out.println("square of number:"+(a*a));
			
		};
		ob.square(5);
	}

}
