package LambdaExpression;
@FunctionalInterface
interface demo
{
	public void add(int a, int b);
}

public class LamdaAdd {

	public static void main(String[] args) 
	{
		demo ob = (int a, int b) ->{
			System.out.println("Addition of two number:"+(a+b));
		
		};
		ob.add(10, 20);
	}

}
