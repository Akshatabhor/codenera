package ExceptionHandling;
import java.util.Scanner;
public class IntegerException {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the two integer");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			int ans=no1+no2;
			System.out.println("addition of two no:"+ans);
		}
		catch(Exception e)
		{
			System.out.println("exception occure"+e);
		}
		finally
		{
			System.out.println("final block executed");
		}
	}

}
